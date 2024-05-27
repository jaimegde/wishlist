package com.example.wishlist

import android.content.Context
import androidx.room.Room
import com.example.wishlist.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDAO = database.wishDAO())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}