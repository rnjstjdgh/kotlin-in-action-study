package kotlin_code.part2

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>){
//    println("Hello, world!")
//    println(max1(3,5))
//    println(max2(3,5))
//    println(max3(3,5))
//    variableTest()
//    stringTemplate(args)
//    callPersonTest()
    callRectangleTest()
}



//=====================<함수 Start>=====================//

// 기본 함수 문법
fun max1(a: Int, b:Int) : Int {
    return if(a>b) a else b
}

// 식이 본문인 함수 -> 비교적 간결한 함수에 사용
fun max2(a: Int, b : Int) : Int = if(a>b) a else b

/***
 * > 식이 본문인 함수
 *      > 반환 타입이 생략 가능(kotlin 은 타입 추론이 가능하다)
 *      > 블록이 본문인 함수는 생략할 수 없다.(블록이 본문인 함수는 리턴문도 명시해야 하고 반환 타입도 명시해야 함)
 *          > 함수 내용이 길어지면 블락이 본문인 함수를 만들고 리턴 문이 이곳 저곳 위치하게 된다
 *          > 이러한 상황에서는 명시적으로 리턴문과 리턴 타입을 작성하는 것이 실수가 적다고 kotlin 만든 사람들이 판단함
 */
fun max3(a: Int, b : Int) = if(a>b) a else b


//=====================<함수 End>=====================//



//=====================<변수 Start>=====================//
fun variableTest(){
    val message: String

    if(1==1){
        message = "Success"
    }
    else{
        message = "Failed"
    }
    println(message)
}
//=====================<변수 End>=====================//


//=====================<문자열 템플릿 Start>=====================//
fun stringTemplate(args: Array<String>){
    val name = if (args.size > 0) args[0] else "Kotlin"
    val intval = 1
    println("Hello, ${name}hello!")
}
//=====================<문자열 템플릿 End>=====================//


//=====================<클래스와 프로퍼티 Start>=====================//
class Person(
        val name: String,
        var isMarried: Boolean
){
    fun changeMarried(){
        isMarried = !isMarried
    }

//    fun changeName(name: String){
//        this.name = name
//    }
}

fun callPersonTest(){
    val person = Person("soungho", false)
    println(person.name)
//    person.name = "kim"
    println(person.isMarried)
    person.isMarried = true
    println(person.isMarried)
}

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean get() = height == width
}

fun callRectangleTest(){
    val rectangle1 = Rectangle(4,3)
    println(rectangle1.isSquare)

    val rectangle2 = Rectangle(4,4)
    println(rectangle2.isSquare)
}



//=====================<클래스와 프로퍼티 End>=====================//



//=====================<Start>=====================//
//=====================<End>=====================//


//=====================<Start>=====================//
//=====================<End>=====================//

//=====================<Start>=====================//
//=====================<End>=====================//