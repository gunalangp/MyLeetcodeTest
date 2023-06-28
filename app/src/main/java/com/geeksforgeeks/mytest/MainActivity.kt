package com.geeksforgeeks.mytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.geeksforgeeks.mytest.linkedlist.Main
import com.geeksforgeeks.mytest.string.LongestCommonPrefix

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LongestCommonPrefix().main()

    }


}