package com.houdinii.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.ArrayAdapter
import android.widget.Toast
import com.houdinii.coderswag.adapters.CategoryAdapter
import com.houdinii.coderswag.databinding.ActivityMainBinding
//import com.houdinii.coderswag.model.Category
import com.houdinii.coderswag.services.DataService

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = CategoryAdapter(this, DataService.categories)
        binding.categoryListView.adapter = adapter

    /*
        // Only works on listViews:
        binding.categoryListView.setOnItemClickListener{_, _, i, _ ->   // usually adapterView, view, i, l
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }*/
    }
}