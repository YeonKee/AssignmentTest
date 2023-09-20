package com.example.healthbuddy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healthbuddy.databinding.ExecSuggestionItemBinding

class ExecSuggestAdapter (private var execTitle: List<String>, private var execDesc: List<String>) : RecyclerView.Adapter<ExecSuggestAdapter.MyViewHolder>() {
    class MyViewHolder(private val binding: ExecSuggestionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(execTitleItem: String, execDescItem: String) {
            binding.execTitle.text = execTitleItem
            binding.execDesc.text = execDescItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ExecSuggestionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val execTitleTxt = execTitle[position]
        val execDescTxt = execDesc[position]
        holder.bind(execTitleTxt, execDescTxt)
    }

    override fun getItemCount(): Int {
        return execTitle.size
    }
}
