package com.houdinii.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.houdinii.coderswag.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Don't forget to put binding. before elements now.
    }
}