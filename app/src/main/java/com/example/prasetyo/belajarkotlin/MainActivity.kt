package com.example.prasetyo.belajarkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.itemAnimator = DefaultItemAnimator()
        club_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        club_list.adapter = Adapter(this, items)

    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val description = resources.getStringArray(R.array.club_description)
        items.clear()
        for(i in name.indices){
            items.add(Item(name[i], image.getResourceId(i, 0), description[i]))
        }

        image.recycle()
    }
}
