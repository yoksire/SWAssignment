package com.kivous.spendwiseassignment.data.models

data class Meal(
    val id: Int? = null,
    val mealName: String? = null,
    val isVeg: Boolean? = null,
    val mealItems: String? = null,
    val mealPrice: Int? = null,
    val mealRating: Double? = null,
    val reviewCount: Int? = null,
    val mealPhoto: Int? = null,
)