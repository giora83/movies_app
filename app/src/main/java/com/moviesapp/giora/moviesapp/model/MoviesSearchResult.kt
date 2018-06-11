package com.moviesapp.giora.moviesapp.model

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList

data class MoviesSearchResult (
    val data: LiveData<PagedList<Movie>>,
    val networkErrors: LiveData<String>
)