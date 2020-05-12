package com.example.androidproiect

data class Hobby(var title:String)

object Supplier {

    val hobbies = listOf<Hobby>(
        Hobby("Programming"),
        Hobby("Space"),
        Hobby("Gaming"),
        Hobby("John Wick Movies"))

}