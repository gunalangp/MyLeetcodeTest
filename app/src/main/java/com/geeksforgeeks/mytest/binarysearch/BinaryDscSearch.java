package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryDscSearch {

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void main() {
        int[] arr = {22, 17, 14, 11, 8, 5, 3, 2};
        int target = 5;
        int a = binarySearch(arr, target);
        Log.e("mytestt",  "binary dec  " + a);
    }


}
