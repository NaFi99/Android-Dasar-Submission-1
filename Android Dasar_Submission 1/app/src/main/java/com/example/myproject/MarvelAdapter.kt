package com.example.myproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_marvel.view.*

class MarvelAdapter (private val listMovie: ArrayList<MCU>): RecyclerView.Adapter<MarvelAdapter.ListViewHolder>() {
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //Memanggil properti ke elemen view
        fun bind(item: MCU){
            with(itemView){
                Glide.with(itemView.context)
                        .load(item.photo)
                        .apply(RequestOptions().override(55, 55))
                        .into(img_poster)

                tv_item_title.text = item.title
                tv_item_director.text=item.director

                itemView.setOnClickListener{onItemClickCallback?.onItemClicked(item)}

            }
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_marvel, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMovie[position])

    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: MCU)
    }

}
//ukuran image 100-300 kb