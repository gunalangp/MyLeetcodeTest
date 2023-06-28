package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryFirstAndLastPosElement {

    int findFirst(int[] nums, int target, boolean isStart){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            } else {
                ans = mid;
                if(isStart){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public void main() {
        int[] arr = {2, 5, 7, 8, 10, 14, 17, 22};
        int target = 9;
        int[] a = new int[2];
        a[0] = findFirst(arr, target, true);
        a[1] = findFirst(arr, target, false);
        Log.e("mytestt", "first & last " + a[0] + " " + a[1]);
    }


}
