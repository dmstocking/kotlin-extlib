package com.github.dmstocking.kotlin

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MaybeTest {

    @Test
    fun `map on nothing returns nothing`() {
        nothing<Int>()
                .map { i -> i.toString() }
    }

    @Test
    fun flatMap() {
    }

    @Test
    fun filter() {
    }

    @Test
    fun toList() {
    }

    @Test
    fun toIterate() {
    }
}