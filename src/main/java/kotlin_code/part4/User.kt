package kotlin_code.part4

class User(val name: String) {
    var address: String = "unspecified"
    set(value: String) {
        println("""
            Address was changed for $name:
            "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun main(args: Array<String>) = run{
    val user = User("Alice")
    user.address = "ad1"
    user.address = "ad2"
}
