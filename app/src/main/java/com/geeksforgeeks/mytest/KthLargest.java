package com.geeksforgeeks.mytest;

import android.util.Log;

import java.util.Arrays;
import java.util.PriorityQueue;
//https://leetcode.com/problems/kth-largest-element-in-an-array/solutions/60580/java-priorityqueue-o-n-log-k/
public class KthLargest {

    int kth(int[] arr, int k) {
        PriorityQueue<Integer> ques = new PriorityQueue<>(k + 1);
        for(int i =0 ; i< arr.length; i++){
            ques.add(arr[i]);
            if(ques.size() > k){
                ques.poll();
            }
        }
        return ques.poll();
    }

    public void main() {
        int[] arr = { 10, 21, 33, 17, 3, 2, 1, 0, 4};
        int target = 3;
        int max = kth(arr, target);
        Log.e("mytestt", "kth " + max);

    }


}
