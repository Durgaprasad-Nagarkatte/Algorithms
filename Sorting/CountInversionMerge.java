package com.durgaprasad.Sorting;

public class CountInversionMerge {
    public static int merge(int[] arr, int low, int mid, int high){
        int n = mid-low+1, m = high-mid, j = 0, k = 0, l = low, res = 0;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++){
            arr1[i] = arr[low+i];
        }
        for(int i = 0; i < m; i++){
            arr2[i] = arr[mid+1+i];
        }

        while((j < n) && (k < m)){
            if(arr1[j] < arr2[k]){
                arr[l++] = arr1[j++];
            }else{
                arr[l++] = arr2[k++];
                res += res + (n-j);
            }
        }

        while(j < n){
            arr[l++] = arr1[j++];
        }

        while(k < m){
            arr[l++] = arr2[k++];
        }

        return res;
    }

    public static int countInversion(int[] arr, int low, int high){
        int res = 0;
        if(low < high){
            int mid = low + (high - low)/2;
            res += countInversion(arr, low, mid);
            res += countInversion(arr, mid+1, high);
            res += merge(arr, low, mid, high);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = new int[]{2, 4, 1, 3, 5, 7};
        int n = arr.length-1;
        int count = countInversion(arr, 0, n);

        System.out.println("Count : "  + count);
    }
}
