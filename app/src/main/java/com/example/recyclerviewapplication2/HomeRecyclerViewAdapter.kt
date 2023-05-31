package com.example.recyclerviewapplication2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapplication2.databinding.ItemViewBinding

class HomeRecyclerViewAdapter(val listItem: MutableList<Email>) : RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemViewBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = listItem[position]
        holder.binding.apply {
            emailAuthorTV.text = item.author
            emailSubjectTV.text = item.subject
            emailContentTV.text = item.content
        }
    }

    override fun getItemCount() = listItem.size
}