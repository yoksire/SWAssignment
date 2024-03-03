package com.kivous.spendwiseassignment.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.kivous.spendwiseassignment.data.models.PopularMeal
import com.kivous.spendwiseassignment.databinding.ListPopularMealBinding

class PopularMealAdapter : RecyclerView.Adapter<PopularMealAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListPopularMealBinding) : RecyclerView.ViewHolder(binding.root)

    val differ = AsyncListDiffer(this, Comparator)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListPopularMealBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val popularMeal = differ.currentList[position]
        holder.binding.apply {
            tvMealName.text = popularMeal.mealName
            popularMeal.mealImage?.let { ivMealImage.setImageResource(it) }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}


object Comparator : DiffUtil.ItemCallback<PopularMeal>() {
    override fun areItemsTheSame(oldItem: PopularMeal, newItem: PopularMeal): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: PopularMeal, newItem: PopularMeal): Boolean =
        oldItem == newItem

}