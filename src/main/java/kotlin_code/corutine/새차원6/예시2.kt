package kotlin_code.corutine.새차원6

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

fun main() = runBlocking<Unit> {
    val a = async {
        log(msg = "I'm computing a piece of the answer")
        6
    }

    val b = async {
        log(msg = "I'm computing a piece of the answer")
        7
    }

    log("The answer is ${a.await() * b.await()}")
}