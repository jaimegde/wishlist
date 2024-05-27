package com.example.wishlist

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.wishlist.data.Wish
import com.example.wishlist.data.WishDAO

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false

)
abstract class WishDatabase: RoomDatabase() {

    abstract fun wishDAO(): WishDAO
}