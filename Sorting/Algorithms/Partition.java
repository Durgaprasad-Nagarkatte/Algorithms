package com.durgaprasad.Sorting.Algorithms;

public class Partition {
    public void naivePartition(int[] arr, int pivot){
        int[] temp = new int[arr.length];
        int j = 0, k = arr.length-1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < pivot){
                temp[j++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > pivot){
                temp[k--] = arr[i];
            }
        }

        while(j <= k){
            temp[j++] = pivot;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

    public void lumotoPartition(int[] arr){
        int l = -1, h = arr.length-2, temp;
        int pivot = arr[arr.length-1];

        for(int i = 0; i <= h; i++){
            if(arr[i] < pivot){
                l = l+1;
                temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
            }
        }
        l = l + 1;
        temp = arr[l];
        arr[l] = arr[h+1];
        arr[h+1] = temp;
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Partition partition = new Partition();
        int[] arr =  {5, 3, 8, 4, 2, 7, 1, 10};

        arr = new int[]{5, 3, 8, 4, 5, 7, 1, 2};
        partition.naivePartition(arr, 5);
        partition.print(arr);

        arr = new int[]{5, 3, 8, 4, 5, 7, 1, 2};
        partition.lumotoPartition(arr);
        partition.print(arr);

    }
}
