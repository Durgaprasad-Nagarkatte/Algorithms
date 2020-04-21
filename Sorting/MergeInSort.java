package com.durgaprasad.Sorting;

public class MergeInSort {

    public static void merge(int[] arr, int low, int mid, int high){
        int[] arr1 = new int[mid-low+1];
        int[] arr2 = new int[high-mid];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[low+i];
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[mid+i+1];
        }

        int j = 0, k = 0, l = 0;
        while((j <= (mid-low)) && (k < (high-mid))){
            if(arr1[j] <= arr2[k]){
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

    public static void main(String[] args){
        int arr[] = new int[]{10, 15, 20, 40, 8, 11, 15, 22, 25};
        merge(arr, 0, 3, 8);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
