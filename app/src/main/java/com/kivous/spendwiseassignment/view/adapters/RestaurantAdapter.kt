package com.kivous.spendwiseassignment.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kivous.spendwiseassignment.data.models.Restaurant
import com.kivous.spendwiseassignment.databinding.ListMealShopBinding

class MealShopsAdapter(private val context: Context) :
    RecyclerView.Adapter<MealShopsAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListMealShopBinding) : RecyclerView.ViewHolder(binding.root)

    val differ = AsyncListDiffer(this, Comparator2)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ListMealShopBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mealShop = differ.currentList[position]
        val adapter = MealAdapter()
        holder.binding.apply {
            tvName.text = mealShop.name
            tvRating.text = mealShop.rating.toString()
            tvTimeAndDistance.text = "${mealShop.time} min | ${mealShop.distance} km"
            tvStartsFrom.text = "Starts from ₹ ${mealShop.startsFrom} only"

            recyclerView.adapter = adapter
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter.differ.submitList(mealShop.meals)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}


object Comparator2 : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean =
        oldItem == newItem
}