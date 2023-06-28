package com.geeksforgeeks.mytest;

import android.util.Log;

import java.util.Arrays;

public class FindMissingNumber {

    int selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = getMaxNum(arr, 0, last);
            swap(arr, max, last);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

    int getMaxNum(int[] arr, int start, int last) {
        int max = arr[start];
        for (int j = start; j < last; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        return max;
    }

    void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }


    public void main() {
        int[] arr = {1, 4, 5, 7, 3, 23};
        int max = selectionSort(arr);
        Log.e("mytestt", "missing number " + max);

    }


}
