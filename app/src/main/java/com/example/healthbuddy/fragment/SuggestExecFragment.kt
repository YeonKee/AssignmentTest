package com.example.healthbuddy.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthbuddy.ExecSuggestAdapter
import com.example.healthbuddy.R
import com.example.healthbuddy.databinding.FragmentAnalysisNutriBinding
import com.example.healthbuddy.databinding.FragmentExerSuggestionBinding

class SuggestExecFragment : Fragment() {
    private var _binding: FragmentExerSuggestionBinding? = null
    private val binding get() = _binding!!

    private val execTitleList = ArrayList<String>()
    private val execDescList = ArrayList<String>()
    private lateinit var execSuggestAdapter: ExecSuggestAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExerSuggestionBinding.inflate(inflater, container, false)
        val view = binding.root

        execSuggestAdapter = ExecSuggestAdapter(execTitleList, execDescList)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.exerSuggestionView.layoutManager = layoutManager
        binding.exerSuggestionView.adapter = execSuggestAdapter
        prepareItems()

        return view
    }

    private fun prepareItems() {
        execTitleList.add("Title 1")
        execTitleList.add("Title 2")
        execTitleList.add("Title 3")

        execDescList.add("Description 1")
        execDescList.add("Description 2")
        execDescList.add("Description 3")

        execSuggestAdapter.notifyDataSetChanged()
    }
}