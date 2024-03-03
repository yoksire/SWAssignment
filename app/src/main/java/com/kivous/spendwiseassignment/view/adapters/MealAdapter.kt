package com.kivous.spendwiseassignment.view.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.kivous.spendwiseassignment.R
import com.kivous.spendwiseassignment.data.models.Meal
import com.kivous.spendwiseassignment.databinding.ListMealBinding

class MealAdapter : RecyclerView.Adapter<MealAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListMealBinding) : RecyclerView.ViewHolder(binding.root)

    val differ = AsyncListDiffer(this, Comparator3)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListMealBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meal = differ.currentList[position]
        holder.binding.apply {
            tvMealName.text = meal.mealName
            tvMealItems.text = meal.mealItems
            tvPrice.text = "₹ ${meal.mealPrice.toString()}"
            tvRating.text = meal.mealRating.toString()
            tvReviewCount.text = "(${meal.reviewCount.toString()})"
            if (meal.isVeg == true) {
                ivMealType.setImageResource(R.drawable.veg_logo)
            } else {
                ivMealType.setImageResource(R.drawable.non_veg_logo)
            }
            meal.mealPhoto?.let { ivMealImage.setImageResource(it) }
        }

    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}


object Comparator3 : DiffUtil.ItemCallback<Meal>() {
    override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean = oldItem == newItem
}