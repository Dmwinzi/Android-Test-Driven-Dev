package com.example.testdriven

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ResourceComparerTest {

    private lateinit var  resourceComparer : ResourceComparer

    @Before
    fun Setup(){
         resourceComparer = ResourceComparer()
    }

    @Test
    fun matches(){

        var context = ApplicationProvider.getApplicationContext<Context>()

        var result = resourceComparer.Compareappname(context,R.string.app_name,"Test Driven")

        assert(result).equals(true)

    }


}