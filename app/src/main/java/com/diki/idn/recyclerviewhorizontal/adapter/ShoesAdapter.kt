package com.diki.idn.recyclerviewhorizontal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diki.idn.recyclerviewhorizontal.R
import kotlinx.android.synthetic.main.item_row.view.*

class ShoesAdapter(val item: ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<ShoesAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvShoes = view.text_title //id from item_row
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_row, parent, false))
    }

    override fun getItemCount(): Int = item.size //to count how long the item take

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvShoes.text = item[position]
    }
}