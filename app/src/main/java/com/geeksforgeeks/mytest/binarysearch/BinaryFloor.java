package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryFloor {

    public int findCeiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    public void main() {
        int[] arr = {2, 5, 7, 8, 10, 14, 17, 22};
        int target = 9;
        int a = findCeiling(arr, target);
        Log.e("mytestt", "flooring  " + arr[a]);
    }


}
