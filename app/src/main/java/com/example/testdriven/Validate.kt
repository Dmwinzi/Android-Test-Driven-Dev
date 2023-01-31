package com.example.testdriven

object Validate {


    fun isvalid(username: String,password:String) : Boolean{
        if (username.isEmpty() || password.length < 8){
            return false
        } else {
            return true
        }

    }



}