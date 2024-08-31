package kotlinstudy

class Practice3 {
    var a:Int? = null
}

fun main(){
    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
    doValue(1)
}

fun doWhen(a: Any){
    when(a) {
        1-> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않는다.") // 다만 등호나 부등호의 사용이 불가능하다.
    }
}

fun doValue(a: Any){
    var result = when(a){
        1->"정수1입니다"
        "DiMo" -> "디모의 강좌"
        is Long -> "Long입니다"
        !is String -> "String "
        else -> "어떤 조건도 만족하지않는다."
    }
    println(result)
}