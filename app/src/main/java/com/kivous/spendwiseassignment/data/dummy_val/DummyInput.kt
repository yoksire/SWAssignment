package com.kivous.spendwiseassignment.data.dummy_val

import com.kivous.spendwiseassignment.R
import com.kivous.spendwiseassignment.data.models.Meal
import com.kivous.spendwiseassignment.data.models.Restaurant
import com.kivous.spendwiseassignment.data.models.PopularMeal

object DummyInput {
    fun popularMeals(): List<PopularMeal> = listOf(
        PopularMeal(1, "Veg Thali", R.drawable.veg_thali),
        PopularMeal(2, "Chicken Thali", R.drawable.chicken_thali),
        PopularMeal(3, "Pulao", R.drawable.pulao),
        PopularMeal(4, "Biryani", R.drawable.chicken_biryani),
        PopularMeal(5, "Veg Thali", R.drawable.veg_thali),
        PopularMeal(6, "Chicken Thali", R.drawable.chicken_thali),
        PopularMeal(7, "Pulao", R.drawable.pulao),
        PopularMeal(8, "Biryani", R.drawable.chicken_biryani),
    )

    fun mealShops(): List<Restaurant> = listOf(
        Restaurant(
            1, "Aruna Mess", 4.2, 19, 1.2, 99, listOf(
                Meal(
                    1,
                    "Non Veg Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.7,
                    78,
                    R.drawable.non_veg_thali
                ),
                Meal(
                    2,
                    "Veg Thali",
                    true,
                    "Paneer Masala + 3 Roti",
                    115,
                    4.4,
                    78,
                    R.drawable.veg_thali_2
                ),
                Meal(
                    3,
                    "Chicken Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.9,
                    78,
                    R.drawable.veg_thali_2
                ),

                )
        ),

        Restaurant(
            2, "Chef Shweta", 4.8, 21, 1.5, 80, listOf(
                Meal(
                    1,
                    "Tawa Pulao",
                    true,
                    "Cooked with basmati rice",
                    80,
                    4.8,
                    65,
                    R.drawable.tawa_pulao
                ),
                Meal(
                    2,
                    "Chicken Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.9,
                    78,
                    R.drawable.veg_thali_2
                ),

                Meal(
                    3,
                    "Veg Thali",
                    true,
                    "Paneer Masala + 3 Roti",
                    115,
                    4.4,
                    78,
                    R.drawable.veg_thali_2
                ),
            )
        ),

        Restaurant(
            3, "Annapurna Mess", 4.2, 19, 1.1, 99, listOf(
                Meal(
                    1,
                    "Non Veg Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.7,
                    78,
                    R.drawable.non_veg_thali
                ),
                Meal(
                    2,
                    "Veg Thali",
                    true,
                    "Paneer Masala + 3 Roti",
                    115,
                    4.4,
                    78,
                    R.drawable.veg_thali_2
                ),
                Meal(
                    3,
                    "Chicken Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.9,
                    78,
                    R.drawable.veg_thali_2
                ),

                )
        ),

        Restaurant(
            4, "Apurna Mess", 4.5, 18, 1.4, 89, listOf(
                Meal(
                    1,
                    "Non Veg Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.7,
                    78,
                    R.drawable.non_veg_thali
                ),
                Meal(
                    2,
                    "Veg Thali",
                    true,
                    "Paneer Masala + 3 Roti",
                    115,
                    4.4,
                    78,
                    R.drawable.veg_thali_2
                ),
                Meal(
                    3,
                    "Chicken Thali",
                    false,
                    "Chicken Masala + 3 Roti",
                    125,
                    4.9,
                    78,
                    R.drawable.veg_thali_2
                ),

                )
        ),
    )


}