package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryPeakIndexInMountain {

    int findPEAK(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int orderAgnostic(int[] arr,int target, int start, int end){
        boolean isAsc = arr[end] > arr[start];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(arr[mid] > target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public void main() {
        int[] arr = {1, 3, 5, 7, 9, 3, 4, 2};
        int target = 4 ;
        int peak = findPEAK(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            Log.e("mytestt", "PEAK in mountain " + firstTry);
        }else {
            int secondTry = orderAgnostic(arr, target, peak, arr.length - 1);
            Log.e("mytestt", "PEAK in mountain " + secondTry);
        }

    }


}
