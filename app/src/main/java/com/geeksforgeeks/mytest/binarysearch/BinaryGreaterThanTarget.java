package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryGreaterThanTarget {

    public int findCeiling(char[] arr, char target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start % arr.length;
    }

    public void main() {
        char[] arr = {'c', 'f', 'j', 't', 'x'};
        char target = 'x';
        int a = findCeiling(arr, target);
        Log.e("mytestt", "greaterthat target " + arr[a]);
    }


}
