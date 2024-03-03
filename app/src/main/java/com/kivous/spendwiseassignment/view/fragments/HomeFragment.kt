package com.kivous.spendwiseassignment.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.kivous.spendwiseassignment.R
import com.kivous.spendwiseassignment.data.dummy_val.DummyInput.popularMeals
import com.kivous.spendwiseassignment.databinding.FragmentHomeBinding
import com.kivous.spendwiseassignment.view.adapters.PopularMealAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: PopularMealAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lunch.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        }

        adapter = PopularMealAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        adapter.differ.submitList(popularMeals())

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}