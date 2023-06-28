package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

import java.util.Arrays;

public class BinaryFindMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] c = new int[a+b];
        for(int i = 0; i < a; i++){
            c[i] = nums1[i];
        }
        for(int i = 0; i < b; i++){
            c[a+i] = nums2[i];
        }
        Arrays.sort(c);
        int start = 0;
        int end = c.length;
        int mid = start + (end - start)/2;
        if(c.length % 2 == 1){
            double ans = c[mid];
            return ans;
        }else {
            int min = (int)(mid);
            int max = (int)(mid) - 1;
            double ans = (c[min] + c[max]);
            return ans/2;
        }

    }

    public void main() {
        int[] arr = {1, 2};
        int[] arr2 = {3};
        double a = findMedianSortedArrays(arr, arr2);
        Log.e("mytestt", "median " + a);
    }


}
