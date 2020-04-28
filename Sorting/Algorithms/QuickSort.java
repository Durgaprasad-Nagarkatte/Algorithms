package com.durgaprasad.Sorting.Algorithms;

public class QuickSort {

    public int lomutoPartition(int[] arr, int l, int h){
        // Considering the last element chosen to be the pivot.
        int temp;
        int pivot = arr[h];
        int k = l-1;

        // Looping from i = 0 to h-1
        for(int i = l; i <= h-1; i++){
            // If the element is less than the pivot, the window size is
            // increased and swapped with greater element.
            if(arr[i] <= pivot) {
                k++;
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
        // Swapping the pivot to the right place.
        int index = k + 1;
        temp = arr[index];

        arr[index] = pivot;
        arr[h] = temp;
        //System.out.print("index : " + l);

        return k + 1;
    }


    public void quickSort(int[] arr, int l, int h){
        // Getting the partion index
        if(l < h){
            System.out.println(l + " " + h);
            int p = lomutoPartition(arr, l, h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        QuickSort sort = new QuickSort();
        int[] a =  {2, 3, 8, 4, 2, 7, 1, 7};
        //sort.lomutoPartition(a, 0, a.length-1);
        sort.quickSort(a, 0, a.length-1);
        sort.print(a);
    }
}
