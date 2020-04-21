package com.durgaprasad.Sorting;

public class MergeSortedArrays {

    /***
     * Merging two sorted arrays
     * Naive solution : Copy the contents of both the array and then sort the array using built-in function.
     * Time Complexity : ((m+n)*log(m+n) + m + n)
     *
     * Better solution: Maintain two pointers of two arrays, compare them and move the pointers accordingly.
     * Time Complexity : O(m+n)
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length, i = 0, j = 0, k = 0;
        int[] merged_arr = new int[m+n];

        while((i < m) && (j < n)){
            if(arr1[i] < arr2[j]){
                merged_arr[k++] = arr1[i++];
            }else{
                merged_arr[k++] = arr2[j++];
            }
        }

        while(i < m){
            merged_arr[k++] = arr1[i++];
        }

        while(j < n){
            merged_arr[k++] = arr2[j++];
        }
        return merged_arr;
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{10, 15, 20, 40};
        int[] arr2 = new int[]{5, 6, 6, 10, 15};

        int[] marr = mergeSortedArrays(arr1, arr2);

        for(int i = 0; i < marr.length; i++){
            System.out.print(marr[i] + " ");
        }

    }
}
