package com.moviesapp.giora.moviesapp

import android.arch.lifecycle.ViewModel;
import com.moviesapp.giora.moviesapp.api.TheMovieDbService
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response


class MoviesFragmentViewModel : ViewModel() {

    fun search(text:String){
//        ServiceLocator.cloudMovieAPI.search(text).enqueue(object :Callback<TheMovieDbService.S>{
//            override fun onFailure(call: Call<TheMovieDbService.SearchResponse>?, t: Throwable?) {
//            }
//
//            override fun onResponse(call: Call<TheMovieDbService.SearchResponse>?, response: Response<TheMovieDbService.SearchResponse>?) {
//                response?.body()?.results?.let {
//                    print(it[0].name)
//                }
//
//            }
//
//        })
    }
}
