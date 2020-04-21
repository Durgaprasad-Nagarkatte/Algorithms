package com.durgaprasad.Sorting.Algorithms;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        int[] arr1 = new int[mid-low+1];
        int[] arr2 = new int[high-mid];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[low+i];
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[mid+i+1];
        }

        int j = 0, k = 0, l = low;
        while((j <= (mid-low)) && (k < (high-mid))){
            if(arr1[j] < arr2[k]){
                arr[l++] = arr1[j++];
            }
            else{
                arr[l++] = arr2[k++];
            }
        }

        while(j <= (mid-low)){
            arr[l++] = arr1[j++];
        }

        while(k < (high-mid)){
            arr[l++] = arr2[k++];
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int m = low + (high-low)/2;
            mergeSort(arr, low, m);
            mergeSort(arr, m+1, high);
            merge(arr, low, m, high);
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{20, 10, 4, 30, 16, 12, 9};
        mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
