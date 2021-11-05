package com.houdinii.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.houdinii.coderswag.databinding.ActivityProductsBinding
import com.houdinii.coderswag.utilities.EXTRA_CATEGORY

private lateinit var binding : ActivityProductsBinding

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}