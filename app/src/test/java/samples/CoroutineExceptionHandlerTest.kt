// This file was automatically generated from 0.md by Knit tool. Do not edit.
package com.github.takahirom.samples

import org.junit.Test
import kotlinx.knit.test.*

class CoroutineExceptionHandlerTest {
    @Test
    fun testExampleCoroutines01() {
        captureOutput("ExampleCoroutines01") { com.github.takahirom.samples.exampleCoroutines01.main() }.verifyOutputLines(
            "start",
            "cancel"
        )
    }

    @Test
    fun testExampleCoroutines02() {
        captureOutput("ExampleCoroutines02") { com.github.takahirom.samples.exampleCoroutines02.main() }.verifyOutputLines(
            "start",
            "cancel",
            "on fail"
        )
    }

    @Test
    fun testExampleCoroutines03() {
        captureOutput("ExampleCoroutines03") { com.github.takahirom.samples.exampleCoroutines03.main() }.verifyOutputLines(
            "start",
            "cancel"
        )
    }

    @Test
    fun testExampleCoroutines04() {
        captureOutput("ExampleCoroutines04") { com.github.takahirom.samples.exampleCoroutines04.main() }.verifyOutputLines(
            "launch",
            "CoroutineExceptionHandler"
        )
    }
}
