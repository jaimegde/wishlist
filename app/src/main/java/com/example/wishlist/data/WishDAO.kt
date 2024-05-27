package com.example.wishlist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun addWish(wishEntity: Wish)

    @Query("SELECT * FROM `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract fun updateAWish(wishEntity: Wish)

    @Query("SELECT * FROM `wish-table`")
    abstract fun getAWishById(id:Long): Flow<Wish>

}