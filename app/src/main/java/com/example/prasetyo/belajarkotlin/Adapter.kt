package com.example.prasetyo.belajarkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class Adapter (private  val context: Context, private  val items: List<Item>)
    :RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder (LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bindItem(items[position])
    }

    override fun getItemCount(): Int {
        return  items.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){

        fun bindItem(items: Item){
            itemView.name.text = items.name
            Glide.with(itemView.context).load(items.image).into(itemView.image)

            itemView.rootView.onClick {
                itemView.context.startActivity<DetailActivity>("name" to "${items.name}", "image" to items.image, "description" to "${items.description}")
            }

        }
    }

}