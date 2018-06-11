package com.moviesapp.giora.moviesapp.api

import com.google.gson.annotations.SerializedName
import com.moviesapp.giora.moviesapp.model.Movie

data class MovieSearchResponse (@SerializedName("total_results") val totalPages: Int = 0,
                                @SerializedName("total_pages") val totalResults: Int = 0,
                                @SerializedName("results") val items: List<Movie> = emptyList(),
                                val page: Int? = null)
