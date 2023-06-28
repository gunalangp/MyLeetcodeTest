package com.geeksforgeeks.mytest;

import android.util.Log;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class BinarySplitArrayLargetsSum {

    int findPivot(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    public void main() {
        int[] arr = {1, 4, 4};
        int target = 3;
        int max = findPivot(arr, target);
        Log.e("mytestt", "LargetsSum " + max);

    }


}
