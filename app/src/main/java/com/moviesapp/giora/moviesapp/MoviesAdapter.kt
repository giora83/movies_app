package com.moviesapp.giora.moviesapp

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.moviesapp.giora.moviesapp.model.Movie

class MoviesAdapter:PagedListAdapter<Movie,RecyclerView.ViewHolder>(
        object :DiffUtil.ItemCallback<Movie>(){
            override fun areItemsTheSame(oldItem: Movie?, newItem: Movie?): Boolean = oldItem?.id ==newItem?.id

            override fun areContentsTheSame(oldItem: Movie?, newItem: Movie?): Boolean = oldItem?.name == newItem?.name


        }){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = MovieViewHolder.create(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = (holder as MovieViewHolder).bind(getItem(position))


    class MovieViewHolder(view: View):RecyclerView.ViewHolder(view){
        private var movie:Movie? = null
        private val title: TextView = view.findViewById(R.id.title)

        fun bind(movie: Movie?) {
            this.movie = movie
            title.text = movie?.name
        }

        companion object {
            fun create(parent: ViewGroup): MovieViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.movie_item, parent, false)
                return MovieViewHolder(view)
            }
        }
    }

}