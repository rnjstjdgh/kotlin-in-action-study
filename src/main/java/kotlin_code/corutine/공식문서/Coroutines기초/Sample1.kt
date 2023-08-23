package kotlin_code.corutine.공식문서.Coroutines기초

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/***
 * https://seyoungcho2.github.io/CoroutinesKoreanTranslation/coroutines-1.html
 */
fun main() = runBlocking {
    launch { doWorld() }
    println("Hello")
}

// 이것은 당신의 첫 일시 중단 함수이다.
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}