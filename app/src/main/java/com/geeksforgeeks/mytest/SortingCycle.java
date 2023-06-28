package com.geeksforgeeks.mytest;

import android.util.Log;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class SortingCycle {


    /*function to implement to cycle sort*/
     int[] cycleSort(int a[], int n) {
        int start, element, pos, temp, i;

   /*Loop to traverse the array elements and place them on the correct

position*/
        for (start = 0; start <= n - 2; start++) {
            element = a[start];

            /*position to place the element*/
            pos = start;

            for (i = start + 1; i < n; i++) {
                if (a[i] < element)
                    pos++;
            }
            if (pos == start)  /*if the element is at exact position*/
                continue;
            while (element == a[pos]) {
                pos += 1;
            }
            if (pos != start) /*put element at its exact position*/ {
                //swap(element, a[pos]);
                temp = element;
                element = a[pos];
                a[pos] = temp;
            }
            /*Rotate rest of the elements*/
            while (pos != start) {
                pos = start;
                /*find position to put the element*/
                for (i = start + 1; i < n; i++) {
                    if (a[i] < element)
                        pos += 1;
                }

                /*Ignore duplicate elements*/
                while (element == a[pos]) {
                    pos += 1;
                }

                /*put element to its correct position*/
                if (element != a[pos]) {
                    temp = element;
                    element = a[pos];
                    a[pos] = temp;
                }
            }
        }
    return a;
    }

    public void main() {
        //cycle sort used for 0 to n numbers sorting
        int[] arr = {15, 14, 7, 11, 10};
        int[] max = cycleSort(arr, arr.length);
        Log.e("mytestt", "sorting " + Arrays.toString(max));
    }


}
