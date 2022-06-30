package com.finalproject.exercisecoordinatorlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentOne : Fragment() {
    private lateinit var recyclerAdapter: RecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var dataAnimals = listOf<String>("Tikus", "Ular", "Gajah", "Jerapah", "Monyet","Tikus", "Ular", "Gajah", "Jerapah", "Monyet","Tikus", "Ular", "Gajah", "Jerapah", "Monyet")
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        recyclerAdapter = RecyclerAdapter()
        recyclerAdapter.setItem(dataAnimals)
        val rcView = view.findViewById<RecyclerView>(R.id.rv_animals)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rcView.layoutManager = layoutManager
        rcView.adapter = recyclerAdapter
        return view
    }

}