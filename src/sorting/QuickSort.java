package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int middle = start + (end-start) / 2;
        int pivot = arr[middle];

        while (start <= end){
            // also a reason why if its already sorted it will not swap
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(arr, low, end);
        sort(arr, start, high);
    }

}


