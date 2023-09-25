package com.mobdeve.s13.dalisay.andres.myapplication.albums

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.dalisay.andres.myapplication.R

class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val albumNameTextView : TextView = itemView.findViewById(R.id.text_album_name)
    val albumCoverImageView : ImageView = itemView.findViewById(R.id.image_album_cover)
}