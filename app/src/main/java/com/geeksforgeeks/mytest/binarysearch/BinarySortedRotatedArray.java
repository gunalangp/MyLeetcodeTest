package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinarySortedRotatedArray {

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    int orderAgnostic(int[] arr,int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public void main() {
        int[] arr = {1};
        int target = 1;
        int peak = findPivot(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            Log.e("mytestt", "rotated1 " + firstTry);
        }else {
            int secondTry = orderAgnostic(arr, target, peak + 1, arr.length - 1);
            Log.e("mytestt", "rotated2 " + secondTry);
        }
    }


}
