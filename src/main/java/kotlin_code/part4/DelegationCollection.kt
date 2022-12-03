package kotlin_code.part4

class DelegationCollection<T> (
        innerList: Collection<T> = ArrayList<T>()
): Collection<T> by innerList {

    val testStr = "str"

}


fun main(args: Array<String>) = run {

    val dCollection = DelegationCollection(ArrayList<Int>());
}
