package kotlin_code.corutine.공식문서.Coroutines기초

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(50_000) { // 많은 수의 코루틴을 실행한다.
        launch {
            delay(5000L)
            println(".${Thread.currentThread().name}")
        }
    }
}