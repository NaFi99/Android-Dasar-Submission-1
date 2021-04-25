package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_row_marvel.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

      DetailFilm()
    }
    private fun DetailFilm() {
        val detail = intent.getParcelableExtra<MCU>("Marv")
        for_title.text = detail?.title
        for_cast.text = detail?.cast
        for_synopsis.text = detail?.synopsis
        for_director.text = detail?.director
        for_release.text = detail?.release
        detail?.let{
            for_image.setImageResource(it.photo)
        }

    }

}