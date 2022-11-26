package kotlin_code.part4

class Client(val name: String, val postalCode: Int) {
    override fun toString() =
            "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(args: Array<String>) = run {
    val client1 = Client("soungho", 1)
    val client2 = Client("soungho", 1)

    println(client1 == client2)
}