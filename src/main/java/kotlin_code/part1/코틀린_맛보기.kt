package kotlin_code.part1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person(name = "영희"),
            Person("철수", age= 29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    print("나이가 가장 많은 사람: $oldest")
}