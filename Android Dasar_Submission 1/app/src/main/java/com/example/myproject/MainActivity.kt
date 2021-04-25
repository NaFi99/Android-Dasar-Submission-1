package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.list
import java.util.Collections.list
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvMovies: RecyclerView
    private var list: ArrayList<MCU> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         supportActionBar?.title = "Marvel Cinematic Universe"

        recyclerV()
        bProfile()
    }

    private fun recyclerV(){
        rv_ListMovie.apply{
            val movAdapter = MarvelAdapter(Marvel.listData)

            adapter = movAdapter

            movAdapter.setOnItemClickCallback(object: MarvelAdapter.OnItemClickCallback{

                override fun onItemClicked(data: MCU) {
                   val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("Marv", data)

                    startActivity(intent)
                }

            })
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }
    private fun bProfile(){
        val prof = findViewById<View>(R.id.imageButton) as ImageButton

        prof.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)

            startActivity(intent)
        }

    }
}