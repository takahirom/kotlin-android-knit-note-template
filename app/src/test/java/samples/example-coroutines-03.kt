// This file was automatically generated from 0.md by Knit tool. Do not edit.
package com.github.takahirom.samples.exampleCoroutines03

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.coroutines.cancellation.CancellationException


fun main() {
    val scope =
        CoroutineScope(SupervisorJob() + Dispatchers.IO)
    scope.launch(CoroutineExceptionHandler { coroutineContext, throwable ->
        println("CoroutineExceptionHandler")
    }) {
        runCatching {
            println("start")
            delay(1000)
        }.onFailure {
            if (it is CancellationException) throw it
            println("on fail")
        }
    }
    Thread.sleep(300)
    println("cancel")
    scope.cancel()
    Thread.sleep(300)
}
