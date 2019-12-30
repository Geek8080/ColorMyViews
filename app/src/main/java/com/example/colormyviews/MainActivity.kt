package com.example.colormyviews

import android.graphics.Color.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        val clickableViews:List<View> = listOf(box_one_text,
            box_two_text,
            box_three_text,
            box_four_text,
            box_five_text,
            red_button,
            yellow_button,
            green_button,
            constraint_layout)
        for(item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(it: View) {
        when(it.id){
            R.id.box_one_text->it.setBackgroundColor(DKGRAY)
            R.id.box_two_text->it.setBackgroundColor(GRAY)
            R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> it.setBackgroundColor(LTGRAY)
        }
    }
}
