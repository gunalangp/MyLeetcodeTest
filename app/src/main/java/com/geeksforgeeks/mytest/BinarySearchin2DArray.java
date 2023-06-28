package com.geeksforgeeks.mytest;

import android.util.Log;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class BinarySearchin2DArray {

    int[] binary2DArray(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};

    }

    public void main() {
        int[][] arr = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;
        int[] max = binary2DArray(arr, target);
        Log.e("mytestt", "2darray " + max[0] + " , " + max[1]);


        int[] myNumbers = {1, 4, 7, 11, 15};
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }
    }


}
