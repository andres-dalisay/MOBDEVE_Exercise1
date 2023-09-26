package com.mobdeve.s13.dalisay.andres.exercise1.tours

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.dalisay.andres.exercise1.R

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

        if (currentItem.isPurchased){
            holder.tourPurchaseButton.isEnabled = false
            holder.tourPurchaseButton.text = "Purchased"
        } else {
            holder.tourPurchaseButton.isEnabled = true
            holder.tourPurchaseButton.setOnClickListener{
                currentItem.isPurchased = true
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount() = data.size
}