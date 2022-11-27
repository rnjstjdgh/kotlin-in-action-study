package kotlin_code.part4

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) = run {
    val lengthCounter = LengthCounter();
    lengthCounter.addWord("string test")
//    lengthCounter.counter = 3
    println(lengthCounter.counter)
}
