package kotlin_code.algo.programmers

val DUMMY_CHARACTER = '?'

class Solution {
    fun solution(s: String): Int {
        var count = 0
        var firstChar = DUMMY_CHARACTER;
        var isNew = true
        var firstCounter = 0
        var otherCounter = 0
        var finalIdx = 0

        for((i,c) in s.withIndex()) {
            if(isNew) {
                firstChar = c
                firstCounter++
                isNew = false
                continue
            }

            if (c == firstChar) {
                firstCounter++
            } else {
                otherCounter++
            }

            if(firstCounter == otherCounter) {
                count++
                firstCounter = 0
                otherCounter = 0
                isNew = true
                finalIdx = i
            }
        }
        if(finalIdx + 1 != s.length) count++

        return count
    }
}


fun main(args: Array<String>) = run {
    val sol = Solution()
    println(sol.solution("abracadabra"))
}