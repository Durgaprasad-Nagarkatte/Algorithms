package com.durgaprasad.Sorting.Algorithms;

/***
 * Insertion Sorting : Best sorting algorithm for smaller sized arrays.
 * Logic : Keep the left part of the array sorted.
 * Best Case : When array is already sorted.
 * Worst Case : When array is reverse sorted.
 */
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                int elem = arr[i];
                int j = i - 1;
                while((j >= 0) && (arr[j] > elem)){
                    arr[j+1] = arr[j];
                    j--;
                }
                j = j+1;
                arr[j] = elem;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = new int[]{50, 20, 40, 60, 10, 30};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
