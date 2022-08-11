package kotlin_code.part2

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

// java style
fun eval1(e : Expr): Int {
    if(e is Num){
        val n = e as Num
        return n.value
    }
    if(e is Sum){
        val sum = e as Sum
        return eval1(sum.left) + eval1(sum.right)
    }
    throw java.lang.IllegalArgumentException("Unknown expression")
}


// kotlin style
// -> 각 분기의 is 문 이후에는 스마트 케스팅이 적용됨
fun eval2(e: Expr) =
        if(e is Num){
            e.value
        }
        else if(e is Sum){
            eval1(e.left) + eval1(e.right)
        }
        else{
            throw java.lang.IllegalArgumentException("Unknown expression")
        }

// kotlin style
fun eval3(e: Expr) =
        when (e){
            is Num -> e.value
            is Sum -> eval1(e.left) + eval1(e.right)
            else -> throw java.lang.IllegalArgumentException("Unknown expression")
        }

fun evalWithLog(e: Expr): Int =
        when(e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLog(e.left)
                val right = evalWithLog(e.right)
                println("sum $left + $right")
                left + right
            }
            else -> throw java.lang.IllegalArgumentException("Unknown expression")
        }

