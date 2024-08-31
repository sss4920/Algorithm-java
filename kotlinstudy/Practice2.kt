package kotlinstudy
/*
형변환 : toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()

 */
class Practice2 (var name:String, val birthYear:Int){
    fun main(){
        var a: Int = 30
        var b: Long = a.toLong() //명시적 형변환. 암시적 형변환을 막는다.
        var intArr = arrayOf(1,2,3,4,5) // 배열 만들어주기.
        var nullArr = arrayOfNulls<Int>(5) //비어잇는 배열
        intArr[2] = 8
        println(intArr[4])

        //타입추론
        var c = 1234
        //이런식으로 코드양을 줄일 수 있다.

    }
}
fun main(){
    println(add(1,2,3))
}

fun add(a:Int, b:Int, c:Int): Int{ //반환값.
    return a+b+c
}

fun add2(a:Int, b:Int, c:Int) = a+b+c //반환값을 추론 가능하므로 이런식으로 설정가능.
//함수형 언어를 이해하기