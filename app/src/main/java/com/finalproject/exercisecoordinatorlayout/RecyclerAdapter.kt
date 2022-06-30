package com.finalproject.exercisecoordinatorlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private lateinit var animals: List<String>

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvAnimal: TextView = itemView.findViewById(R.id.tv_animal)

        fun bind(animal: String){
            tvAnimal.text = animal
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        return RecyclerAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(animals.get(position))
    }

    fun setItem(animals: List<String>){
        this.animals = animals
    }

    override fun getItemCount(): Int {
        return animals.size
    }
}