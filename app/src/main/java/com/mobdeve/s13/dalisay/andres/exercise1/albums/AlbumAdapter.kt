package com.mobdeve.s13.dalisay.andres.exercise1.albums

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobdeve.s13.dalisay.andres.exercise1.R

class AlbumAdapter(private val data: ArrayList<AlbumData>) : RecyclerView.Adapter<AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_albums, parent, false)
        return AlbumViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val currentItem = data[position]
        holder.albumNameTextView.text = currentItem.albumName
        // Load and display the image using Glide (replace "imageView" with your ImageView ID)
        Glide.with(holder.itemView.context)
            .load(currentItem.albumCoverPosition)
            .into(holder.albumCoverImageView)
    }

    override fun getItemCount() = data.size
}