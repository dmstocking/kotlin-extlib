package com.github.dmstocking.kotlin

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NullableTest {


    @Test
    fun `orElse when not null returns the same object`() {
        val actual: Int? = 1337
        assertEquals(1337, actual.orElse(42))
    }

    @Test
    fun `map when not null returns the same object`() {
        val actual: Int? = 1337
        assertEquals(1337, actual.orElse(42))
    }
}