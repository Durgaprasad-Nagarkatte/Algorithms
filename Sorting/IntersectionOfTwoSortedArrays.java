package com.durgaprasad.Sorting;

public class IntersectionOfTwoSortedArrays {
    /*
    Logic : Check whether they are equal. If equal check whether the previous element is equal to the current element in the first array.
     */
    public static void intersectionOfArraysBetter(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length, i = 0, j = 0;

        while((i < m) && (j < n)){
            if((i > 0) && (arr1[i] == arr1[i-1])){
                i++;
                continue;
            }
            else if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        System.out.println();
    }
    public static void intersectionOfArrays(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length, i = 0, j = 0;

        while((i < m) && (j < n)){
            if((i == 0) && (arr1[i] == arr2[j])){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            if((i > 0) && (arr1[i] == arr2[j]) && (arr1[i] != arr1[i-1])){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr1[] = new int[]{2, 5, 8, 13, 15};
        int arr2[] = new int[]{1, 3, 8, 15, 18, 20, 25};

        int arr3[] = new int[]{1, 1, 3, 3, 3};
        int arr4[] = new int[]{1, 1, 1, 1, 3, 5 ,7};
        intersectionOfArrays(arr1, arr2);
        intersectionOfArrays(arr3, arr4);
        intersectionOfArraysBetter(arr1, arr2);
        intersectionOfArraysBetter(arr3, arr4);

    }
}
