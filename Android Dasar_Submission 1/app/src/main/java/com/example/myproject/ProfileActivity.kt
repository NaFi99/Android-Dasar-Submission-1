package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ProfileActivity : AppCompatActivity() {
    private lateinit var userPhoto: ImageView
    private lateinit var userName: TextView
    private lateinit var userEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_row)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        userPhoto = findViewById(R.id.for_photo)
        userName = findViewById(R.id.for_name)
        userEmail = findViewById(R.id.for_email)
    }


    }