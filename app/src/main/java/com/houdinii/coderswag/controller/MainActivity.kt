package com.houdinii.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
//import android.widget.ArrayAdapter
//import android.widget.Toast
import com.houdinii.coderswag.adapters.CategoryRecycleAdapter
import com.houdinii.coderswag.databinding.ActivityMainBinding
//import com.houdinii.coderswag.model.Category
import com.houdinii.coderswag.services.DataService

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        binding.categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        binding.categoryListView.layoutManager = layoutManager
        binding.categoryListView.setHasFixedSize(true)

    /*
        // Only works on listViews:
        binding.categoryListView.setOnItemClickListener{_, _, i, _ ->   // usually adapterView, view, i, l
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/
    }
}