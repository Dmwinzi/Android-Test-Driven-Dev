package com.example.testdriven

import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testdriven.ui.theme.Bye
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Bye {


    @get:Rule
    var createcomposetestRule = createComposeRule()

    @Test
    fun isBye(){

        createcomposetestRule.setContent {
            Bye()
        }

        createcomposetestRule.onNodeWithText("Hello").performClick()

        createcomposetestRule.onNodeWithText("Bye").assertExists()

    }


}