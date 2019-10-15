package com.ALement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinois", "Burger King", "Kebab", "Pizza", "Sandwich", "Mcdonald's", "KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        choiceBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]

        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodText.text.toString()
            if(newFood.length >= 2){
                foodList.add(newFood)
                addFoodText.text.clear()
            }else{
                addFoodText.setError("Le nom doit contenir 2 caractères minimum!")
            }

        }
    }


}
