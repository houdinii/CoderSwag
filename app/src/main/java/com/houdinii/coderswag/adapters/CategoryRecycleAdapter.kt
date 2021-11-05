package com.houdinii.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.houdinii.coderswag.R
import com.houdinii.coderswag.model.Category

class CategoryRecycleAdapter(val context : Context, val categories : List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    override fun onBindViewHolder(Holder: Holder, position: Int) {
        Holder.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        // Called when new view holders are needed
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_list_item, parent, false)

        return Holder(view)
    }

    @Suppress("ClassName")
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.categoryImage)
        val categoryName: TextView = itemView.findViewById(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
        }
    }
}