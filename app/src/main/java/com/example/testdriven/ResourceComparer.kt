package com.example.testdriven

import android.content.Context

class ResourceComparer {


    fun Compareappname(context:Context, resid : Int , name : String) : Boolean{

        if (context.getString(resid).equals(name)){
            return true
        } else {
            return false
        }

    }


}