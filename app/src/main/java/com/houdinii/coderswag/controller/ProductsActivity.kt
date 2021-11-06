package com.houdinii.coderswag.controller

import android.content.res.Configuration
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.houdinii.coderswag.adapters.ProductsAdapter
import com.houdinii.coderswag.databinding.ActivityProductsBinding
import com.houdinii.coderswag.services.DataService
import com.houdinii.coderswag.utilities.EXTRA_CATEGORY

private lateinit var binding : ActivityProductsBinding

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        binding.productsListView.layoutManager = layoutManager
        binding.productsListView.adapter = adapter

    }
}