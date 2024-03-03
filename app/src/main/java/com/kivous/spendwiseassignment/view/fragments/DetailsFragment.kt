package com.kivous.spendwiseassignment.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.kivous.spendwiseassignment.data.dummy_val.DummyInput.mealShops
import com.kivous.spendwiseassignment.databinding.FragmentDetailsBinding
import com.kivous.spendwiseassignment.view.adapters.MealShopsAdapter

class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: MealShopsAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivBackArrow.setOnClickListener {
            findNavController().navigateUp()
        }

        adapter = MealShopsAdapter(requireContext())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter.differ.submitList(mealShops())

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}