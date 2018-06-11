package com.moviesapp.giora.moviesapp.model
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie(@PrimaryKey val id:Long, val logoPath:String?, val name:String)