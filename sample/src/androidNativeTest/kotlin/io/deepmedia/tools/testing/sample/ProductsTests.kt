package io.deepmedia.tools.testing.sample

import kotlin.test.Test
import kotlin.test.assertEquals

class ProductsTests {

    private val products = Products()

    @Test
    fun testProductCorrect() {
        val product = products.multiplyCorrect(5, 5)
        assertEquals(25, product)
    }

    @Test
    fun testProductFailing() {
        val product = products.multiplyFailing(5, 5)
        assertEquals(25, product)
    }
}