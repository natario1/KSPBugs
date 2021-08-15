package io.deepmedia.tools.testing.sample

import kotlin.test.Test
import kotlin.test.assertEquals

class SumsTests {

    private val sums = Sums()

    @Test
    fun testSumCorrect() {
        val sum = sums.sumCorrect(5, 5)
        assertEquals(10, sum)
    }

    @Test
    fun testSumFailing() {
        val sum = sums.sumFailing(5, 5)
        assertEquals(10, sum)
    }
}