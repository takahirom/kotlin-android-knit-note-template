// This file was automatically generated from 0.md by Knit tool. Do not edit.
package com.github.takahirom.samples.exampleCoroutines04

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.coroutines.cancellation.CancellationException


 fun main() {
    val scope =
        CoroutineScope(SupervisorJob() + Dispatchers.IO + CoroutineExceptionHandler { coroutineContext, throwable ->
            println("CoroutineExceptionHandler")
        })
    scope.launch {
        println("launch")
        throw RuntimeException()
    }
    Thread.sleep(300)
}
