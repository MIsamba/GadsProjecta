package com.example.gadsprojecta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LeadRecycleAdapter (private val context: Context) :
    RecyclerView.Adapter <LeadRecycleAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val layoutInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LeadRecycleAdapter.ViewHolder {
        val itemview = LayoutInflater.inflate(R.layout.learning_single_cardview, parent, attachToRoot: false)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: LeadRecycleAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}