package com.mobdeve.s13.dalisay.andres.myapplication.tours

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobdeve.s13.dalisay.andres.myapplication.R

class TourAdapter(private val data: ArrayList<TourData>) : RecyclerView.Adapter<TourViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_tour_dates, parent, false)
        return TourViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        val currentItem = data[position]
        holder.tourCity.text = currentItem.tourCity
        holder.tourLocation.text = currentItem.tourLocation
        holder.tourCity.text = currentItem.tourCity
        holder.tourDateMonth.text = currentItem.tourDateMonth
        holder.tourDateDay.text = currentItem.tourDateDay
        holder.tourDayOfWeek.text = currentItem.tourDayOfWeek
        holder.tourTime.text = currentItem.tourTime
    }

    override fun getItemCount() = data.size
}