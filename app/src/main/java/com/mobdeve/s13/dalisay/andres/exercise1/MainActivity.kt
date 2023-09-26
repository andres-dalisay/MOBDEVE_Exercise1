package com.mobdeve.s13.dalisay.andres.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mobdeve.s13.dalisay.andres.exercise1.R
import com.mobdeve.s13.dalisay.andres.exercise1.albums.AlbumAdapter
import com.mobdeve.s13.dalisay.andres.exercise1.albums.AlbumData
import com.mobdeve.s13.dalisay.andres.exercise1.tours.TourAdapter
import com.mobdeve.s13.dalisay.andres.exercise1.tours.TourData

class MainActivity : AppCompatActivity() {
    private lateinit var fab: FloatingActionButton
    private var isFavorited = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.favorite_button)

        fab.setOnClickListener {
            // Toggle the FAB's state
            isFavorited = !isFavorited

            // Change the FAB's icon or behavior based on the state
            if (isFavorited) {
                fab.setImageDrawable(ContextCompat.getDrawable(applicationContext,
                    R.drawable.star_filled
                )) // Change to close icon
                // Perform actions when FAB is expanded
            } else {
                fab.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.star)) // Change back to the original icon
                // Perform actions when FAB is collapsed
            }
        }

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = getString(R.string.artist_name)
        supportActionBar?.subtitle = getString(R.string.monthly_listeners)


        val tourList = ArrayList<TourData>()
        tourList.add(TourData("Concord", "Charlotte Motor Speedway", "Sep", "29", "Fri", "4:00 PM"))
        tourList.add(TourData("Santiago", "Teatro Coliseo", "Oct", "12", "Thu", "8:00 PM"))
        tourList.add(TourData("Santiago", "Creamfields Chile", "Oct", "14", "Sat", "8:00 PM"))

        val tourRecycler: RecyclerView = findViewById(R.id.tour_recycler)
        val tourAdapter = TourAdapter(tourList)
        tourRecycler.adapter = tourAdapter
        tourRecycler.layoutManager = LinearLayoutManager(this)

        val albumList = ArrayList<AlbumData>()
        albumList.add(AlbumData("Everything Goes On", R.drawable.image_album_ego))
        albumList.add(AlbumData("Nurture", R.drawable.image_album_nurture))
        albumList.add(AlbumData("Shelter", R.drawable.image_album_shelter))
        albumList.add(AlbumData("Worlds", R.drawable.image_album_worlds))
        albumList.add(AlbumData("Spitfire", R.drawable.image_album_spitfire))

        val albumRecycler: RecyclerView = findViewById(R.id.album_recycler)
        val albumAdapter = AlbumAdapter(albumList)
        albumRecycler.adapter = albumAdapter
        albumRecycler.layoutManager = GridLayoutManager(this, 2)
    }
}