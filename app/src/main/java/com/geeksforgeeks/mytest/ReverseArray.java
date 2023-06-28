package com.geeksforgeeks.mytest;

import android.util.Log;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class ReverseArray {

    int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(start, end, arr);
            start++;
            end--;
        }
        return arr;
    }

    void swap(int s, int e, int[] arr) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }


    public void main() {
        int[] arr = {1, 4, 5, 7, 3, 23};
        int[] max = reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            Log.e("mytestt", "reverse " + arr[i]);
        }
        int a = 55;
        int b = 5;
        int c = a >>> b;
        Log.e("aaa", "yyy");
        //For positive number, >> and >>> works same
        int d = 20 >> 2;
        int e = 40 >>> 2;
        int f = d & e;
        Log.e("aaa", "yyy");
    }


}
