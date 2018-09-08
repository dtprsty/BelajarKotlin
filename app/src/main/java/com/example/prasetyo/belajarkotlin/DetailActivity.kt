package com.example.prasetyo.belajarkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

class DetailActivity: AppCompatActivity() {

    lateinit var mainUI : DetailActivityUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = intent.getStringExtra("name")
        val image = intent.getIntExtra("image", 0)
        val description = intent.getStringExtra("description")

        toast(name)

        mainUI = DetailActivityUI()
        mainUI.setContentView(this)

        Glide.with(this).load(image).into(mainUI.imageLogo)
        mainUI.txtName.text = name
        mainUI.txtDescription.text = description

    }

}