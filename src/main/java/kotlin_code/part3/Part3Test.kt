package kotlin_code.part3

import java.lang.StringBuilder


class Part3Test {
}

fun <T> Collection<T>.joinToString(
        separator: String,
        prefix: String,
        postfix: String
) : String{
    val sb = StringBuilder(prefix)
    for ((idx, ele) in this.withIndex()) {
        sb.append(ele)
        if(this.size -1 > idx) sb.append(separator)
    }
    sb.append(postfix)
    return sb.toString()
}

fun main(args: Array<String>) {
    val mySet = hashSetOf(1,2,3)
    println(mySet.joinToString(separator = "~",prefix = "[",postfix = "]"))

    val myStrings = listOf("first", "second", "third")
//    val myStrings2 = listOf(*myStrings)

    println(myStrings.last())
    println(myStrings.maxOrNull())


    val myMap = mapOf(1 to "one", 2 to "two")

}