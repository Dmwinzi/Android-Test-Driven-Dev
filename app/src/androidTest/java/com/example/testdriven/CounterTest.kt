package com.example.testdriven

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CounterTest {

    @get:Rule
    var composetestrule  = createAndroidComposeRule<MainActivity>()


     @Test
     fun Incrementonclick(){

         composetestrule.onNodeWithTag("BtnHello").assertExists()
         composetestrule.onNodeWithTag("BtnHello").performClick()
         composetestrule.onNodeWithText("1").assertExists()
         composetestrule.onNodeWithTag("Counter").assertTextEquals("1")
     }


}