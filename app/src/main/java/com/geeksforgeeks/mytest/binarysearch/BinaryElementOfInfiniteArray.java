package com.geeksforgeeks.mytest.binarysearch;

import android.util.Log;

public class BinaryElementOfInfiniteArray {

    int findFirst(int[] nums, int target, int start, int end){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    int ans(int[] nums, int target){
        int start = 0;
        int end  = 1;
        while(target > nums[end]){
            int temp = end + 1;
            end = end + ( end - start + 1) * 2;
            start = temp;
        }
        return findFirst(nums, target, start, end);
    }

    public void main() {
        int[] arr = {2, 5, 7, 8, 10, 14, 17, 22};
        int target = 14;
        int ans = ans(arr, target);
        Log.e("mytestt", "infi pos " + ans);
    }


}
