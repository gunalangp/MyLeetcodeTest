package com.geeksforgeeks.mytest;

import android.util.Log;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class JumpGame {

    boolean jump(int[] arr, int m) {
        int c = arr.length;
        if (c == 0) {
            return true;
        }
        int max = 0;
        for (int i = 0; i < c-1 && max >= i; i++) {
            if (max < i + arr[i]) {
                max = i + arr[i];
            }
            if (max >= c - 1) {
                return true;
            }
        }
        return false;
    }

    public void main() {
        int[] arr = {3, 2, 1, 0, 4};
        int target = 14;
        boolean max = jump(arr, target);
        Log.e("mytestt", "jump " + max);

    }


}
