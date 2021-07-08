// This file was automatically generated from 0.md by Knit tool. Do not edit.
package com.github.takahirom.samples

import org.junit.Test
import kotlinx.knit.test.*

class ExampleTest {
    @Test
    fun testExampleCoroutines01() {
        captureOutput("ExampleCoroutines01") { com.github.takahirom.samples.exampleCoroutines01.main() }.verifyOutputLines(
            "test"
        )
    }
}
