package io.deepmedia.tools.testing.sample

import kotlin.test.Test

class LoggerTests {
    val logger = Logger()

    @Test
    fun testUsePlatformApi() {
        logger.usePlatformApi()
    }
}