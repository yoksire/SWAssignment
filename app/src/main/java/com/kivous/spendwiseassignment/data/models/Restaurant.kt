package com.kivous.spendwiseassignment.data.models

data class Restaurant(
    val id: Int? = null,
    val name: String? = null,
    val rating: Double? = null,
    val time: Int? = null,
    val distance: Double? = null,
    val startsFrom: Int? = null,
    val meals: List<Meal>? = null,
)
