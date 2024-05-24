package com.example.wishlist.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""

)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "An android watch"),
        Wish(title = "Book", description = "Eragon"),
        Wish(title = "PC", description = "To code"),
        Wish(title = "TV", description = "HD"),
    )
}