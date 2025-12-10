package com.example.lab_week_13

import androidx.recyclerview.widget.RecyclerView
import com.example.lab_week_13.model.Movie
import androidx.databinding.BindingAdapter

@BindingAdapter("list")
fun bindMovies(view: RecyclerView, movies: List<Movie>?) {
    val adapter = view.adapter as MovieAdapter
    adapter.addMovies(movies ?: emptyList())
}