package com.houdinii.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.houdinii.coderswag.databinding.ActivityMainBinding
import com.houdinii.coderswag.model.Category
import com.houdinii.coderswag.services.DataService

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataService.categories)
        binding.categoryListView.adapter = adapter
    }
}