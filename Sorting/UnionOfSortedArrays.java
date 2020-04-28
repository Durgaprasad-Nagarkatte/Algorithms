package com.durgaprasad.Sorting;

public class UnionOfSortedArrays {
    /*
    Naive: Create a duplicate array of m+n and sort the array, and then print the non duplicate elements.
     */
    public static void unionOfSortedArrays(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length, i = 0, j = 0;
        while((i < m ) && (j < n)){
            if((i > 0) && (arr1[i] == arr1[i-1])){
                i++;
                continue;
            }
            else if((j > 0) && (arr2[j] == arr2[j-1])){
                j++;
                continue;
            }else if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while((i > 0) && (i < m) && (arr1[i] != arr1[i-1])){
            System.out.print(arr1[i] + " " );
            i++;
        }

        while ((j > 0) && (j < n) && (arr2[j] != arr2[j-1])){
            System.out.print(arr2[j] + " ");
            j++;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr1[] = new int[]{2, 5, 8, 13, 15};
        int arr2[] = new int[]{1, 3, 8, 15, 18, 20, 25};

        int arr3[] = new int[]{1, 1, 3, 3, 3};
        int arr4[] = new int[]{1, 1, 1, 1, 3, 5 ,7};
        unionOfSortedArrays(arr1, arr2);
        unionOfSortedArrays(arr3, arr4);
    }

    public static class RotateArray {
    }
}
