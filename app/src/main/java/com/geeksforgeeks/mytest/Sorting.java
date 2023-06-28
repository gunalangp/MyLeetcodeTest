package com.geeksforgeeks.mytest;

import android.util.Log;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class Sorting {

    int[] bubbleShort(int[] arr) {
        boolean noSorting;
        for (int i = 0; i < arr.length; i++) {
            noSorting = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    noSorting = true;
                }
            }
            if (!noSorting) {
                break;
            }
        }
        return arr;
    }

    int[] selectionShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i < last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public void main() {
        int[] arr = {15, 14, 7, 11, 10};
        int[] max = selectionShort(arr);
        Log.e("mytestt", "sorting " + Arrays.toString(max));
    }


}
