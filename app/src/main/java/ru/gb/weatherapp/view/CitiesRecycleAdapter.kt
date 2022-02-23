package ru.gb.weatherapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.gb.weatherapp.R
import ru.gb.weatherapp.model.Repository

class CitiesRecycleAdapter() : RecyclerView.Adapter<CitiesRecycleAdapter.CityViewHolder>() {

    private lateinit var itemListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemListener = listener
    }

    private val repositoryCall = Repository()
    var data: List<String> = repositoryCall.getCities()

    class CityViewHolder(itemView: View, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {

        var city: TextView = itemView.findViewById(R.id.city_item)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val cityItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card_view, parent, false)
        return CityViewHolder(cityItem, itemListener)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.city.text = data[position]
    }

    override fun getItemCount() = data.size
}