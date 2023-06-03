package com.example.mydialog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerAdapter(var list :List<Int>): RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): ViewHolder(itemView){
        fun onBind(a :Int){
            var layout  = itemView.findViewById<LinearLayout>(R.id.layout1)
            layout.setBackgroundColor(ContextCompat.getColor(itemView.context, a))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_item,parent,false))
    }

    override fun getItemCount(): Int  = list.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])

    }


}