package kotlin_code.corutine.새차원6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    launch {
        println("main runBlocking:       I'm working in thread ${Thread.currentThread().name}") // 3
    }

    launch(Dispatchers.Unconfined) {
        println("Unconfined:       I'm working in thread ${Thread.currentThread().name}")   // 1
    }

    launch(Dispatchers.Default) {
        println("Default:       I'm working in thread ${Thread.currentThread().name}")  // 2
    }

    newSingleThreadContext("MyOwnThread").use {
        launch(it) {
            println("newSingleThreadContext:       I'm working in thread ${Thread.currentThread().name}")   // 4
        }
    }
}