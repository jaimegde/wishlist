package com.example.wishlist.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDAO: WishDAO) {

    fun addAWish(wish:Wish){
        wishDAO.addAWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> = wishDAO.getAllWishes()

    fun getAWishById(id:Long) : Flow<Wish> {
        return wishDAO.getAWishById(id)
    }

    suspend fun updateAWish(wish:Wish){
        wishDAO.updateAWish(wish)

    }

    suspend fun deleteAWish(wish: Wish){
        wishDAO.deleteAWish(wish)
    }

}