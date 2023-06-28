package com.geeksforgeeks.mytest;

import android.util.Log;


public class StockBestTimeToBuySell {

    public int maxProfitUtil(int prices[]) {
        int min = prices[0];
        int maxProfit = 0;
        for(int j = 1; j < prices.length; j++){
            if(min < prices[j]){
                maxProfit = Math.max(prices[j] - min, maxProfit);
            }else {
                min = prices[j];
            }
        }
        return maxProfit;
    }

    public void main() {
        int[] arr = {3, 2, 1, 0, 4};
        int max = maxProfitUtil(arr);
        Log.e("mytestt", "jump " + max);
        String a = "abc";
        StringBuilder sb = new StringBuilder("abc");
        if(a.equals(sb)){

        }

    }


}
