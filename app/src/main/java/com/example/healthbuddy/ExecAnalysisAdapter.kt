package com.example.healthbuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthbuddy.database.UserExecData
import com.example.healthbuddy.databinding.ExecAnalysisItemBinding

//class ExecAnalysisAdapter (private var execCat: List<String>, private var execType: List<String>) : RecyclerView.Adapter<ExecAnalysisAdapter.MyViewHolder>() {
//    class MyViewHolder(private val binding: ExecAnalysisItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(execCatItem: String, execTypeItem: String) {
//            binding.exerciseCategorySelected.text = execCatItem
//            binding.exerciseTypeSelected.text = execTypeItem
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val binding = ExecAnalysisItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return MyViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val execCatTxt = execCat[position]
//        val execTypeTxt = execType[position]
//        holder.bind(execCatTxt, execTypeTxt)
//    }
//
//    override fun getItemCount(): Int {
//        return execCat.size
//    }
//}

class ExecAnalysisAdapter: RecyclerView.Adapter<ExecAnalysisAdapter.MyViewHolder>() {

    private var execData = emptyList<UserExecData>()

    class MyViewHolder(private val binding: ExecAnalysisItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(currentData: UserExecData){
            binding.dateTime.text = currentData.exec_date.toString() + ", " + currentData.exec_time.toString()
            binding.exerciseTypeSelected.text = currentData.exec_type.toString()
            binding.exerciseCategorySelected.text = currentData.exec_category.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolderBinding = ExecAnalysisItemBinding.inflate(inflater, parent, false)
        return MyViewHolder(viewHolderBinding)
    }

    override fun getItemCount(): Int {
        return execData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentData = execData[position]
        holder.bind(currentData)
    }

    // Method to update the data
    fun setData(newData: List<UserExecData>) {
        execData = newData
        notifyDataSetChanged()
    }
}

























