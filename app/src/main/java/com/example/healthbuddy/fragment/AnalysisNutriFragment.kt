package com.example.healthbuddy.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthbuddy.databinding.FragmentAnalysisNutriBinding

class AnalysisNutriFragment : Fragment() {

    private var _binding: FragmentAnalysisNutriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnalysisNutriBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

}