package com.moviesapp.giora.moviesapp.api



import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Query
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level


interface TheMovieDbService {


    @GET("3/search/company?api_key=$API_KEY")
    fun search(@Query("query") searchText: String,@Query("page") page:Int): Call<MovieSearchResponse>




    companion object {
        private const val BASE_URL = "https://api.themoviedb.org/"
        private const val API_KEY  = "45eca24b5d416495bb445b7a19f5afa6"

        fun create(): TheMovieDbService{
            val logger = HttpLoggingInterceptor()
            logger.level = Level.BASIC

            val client = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .build()

            return Retrofit.Builder().
                    client(client).
                    baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build()
                    .create(TheMovieDbService::class.java)
        }


    }

}