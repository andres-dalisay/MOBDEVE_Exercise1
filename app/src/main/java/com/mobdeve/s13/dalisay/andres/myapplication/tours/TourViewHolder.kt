package com.mobdeve.s13.dalisay.andres.myapplication.tours

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.dalisay.andres.myapplication.R

class TourViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tourDateMonth : TextView = itemView.findViewById(R.id.text_date_month)
    val tourDateDay : TextView = itemView.findViewById(R.id.text_date_day)
    val tourDayOfWeek : TextView = itemView.findViewById(R.id.text_day_of_week)
    val tourTime : TextView = itemView.findViewById(R.id.text_time)
    val tourCity : TextView = itemView.findViewById(R.id.text_city)
    val tourLocation : TextView = itemView.findViewById(R.id.text_location)
}