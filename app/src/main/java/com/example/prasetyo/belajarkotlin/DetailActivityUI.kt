package com.example.prasetyo.belajarkotlin

import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivityUI : AnkoComponent<DetailActivity> {

    lateinit var txtName: TextView
    lateinit var txtDescription: TextView
    lateinit var imageLogo: ImageView

    override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {

        linearLayout {
            orientation = LinearLayout.VERTICAL

            imageLogo = imageView {

            }.lparams(width = dip(64), height = dip(64)) {
                gravity = Gravity.CENTER
                topMargin = dip(16)
            }
            txtName = textView {
                hint = "club name"
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER
                topMargin = dip(16)
            }
            txtDescription = textView {

            }.lparams(width = matchParent, height = wrapContent) {
                gravity = Gravity.CENTER
                leftMargin = dip(16)
                topMargin = dip(16)
                rightMargin = dip(16)
            }
        }

    }
}