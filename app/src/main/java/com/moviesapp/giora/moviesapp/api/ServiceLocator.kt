package com.moviesapp.giora.moviesapp.api


import android.util.Log
import com.moviesapp.giora.moviesapp.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ServiceLocator {


    private val cloudMovieAPI by lazy {
        TheMovieDbService.create()
    }

    private val TAG: String = ServiceLocator::class.java.simpleName

    fun searchRepos(
            query: String,
            page: Int,
            onSuccess: (repos: List<Movie>) -> Unit,
            onError: (error: String) -> Unit) {
        Log.d(TAG, "query: $query, page: $page")


        cloudMovieAPI.search(query, page).enqueue(
                object : Callback<MovieSearchResponse> {
                    override fun onFailure(call: Call<MovieSearchResponse>?, t: Throwable) {
                        Log.d(TAG, "fail to get data")
                        onError(t.message ?: "unknown error")
                    }

                    override fun onResponse(
                            call: Call<MovieSearchResponse>?,
                            response: Response<MovieSearchResponse>
                    ) {
                        Log.d(TAG, "got a response $response")
                        if (response.isSuccessful) {
                            val movies = response.body()?.items ?: emptyList()
                            onSuccess(movies)
                        } else {
                            onError(response.errorBody()?.string() ?: "Unknown error")
                        }
                    }
                }
        )
    }
}