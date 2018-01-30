package com.jarzasa.madridshops.repository

import com.jarzasa.madridshops.repository.DB.convert
import org.junit.Test

import org.junit.Assert.*

class DBHelperTest {
    @Test
    @Throws(Exception::class)
    fun given_false_converts_into_0() {
        assertEquals(0, convert(false).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun given_true_converts_into_1() {
        assertEquals(1, convert(true).toLong())
    }
}