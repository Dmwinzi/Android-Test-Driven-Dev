package com.example.testdriven

import com.example.testdriven.Validate.isvalid
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class ValidateTest {

    @Test
    fun valid() {

        val username  = "l"
        var password = "Danielmwinzi"

        var result = Validate.isvalid(username,password)

        assert(result).equals(true)

    }

}