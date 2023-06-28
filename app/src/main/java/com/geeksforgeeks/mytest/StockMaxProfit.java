package com.geeksforgeeks.mytest;

import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class StockMaxProfit {

    public int maxProfitUtil(int prices[], int start) {
        if (start >= prices.length) {
            return 0;
        }

        int max = 0;
        for (int i = start; i < prices.length; i++) {
            int maxprofit = 0;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int profit = maxProfitUtil(prices, j + 1) + prices[j] - prices[i];

                    if (profit > maxprofit) {
                        maxprofit = profit;
                    }
                }
            }

            if (maxprofit > max) {
                max = maxprofit;
            }
        }

        return max;
    }

    public int maxProfit(int[] prices) {
        return maxProfitUtil(prices, 0);
    }

    public void main() {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3, 3, 5, 0, 0, 3, 1, 4};
        int target = 14;
        int max = maxProfit2(arr);
        Log.e("mytestt", "maxprofit " + max);
    }

    public int maxProfit2(int[] prices) {
        int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }


}
