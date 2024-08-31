package kotlinstudy

//한줄주석
/*
 * 여러줄 주석
 * var(일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능하다.) vs val(선언시에만 초기화가 가능, 중간에 값을 변경할 수 없다.)
 */
class Practice {
    //클래스에 선언되는 변수는 property 속성이라고 불림.
    fun main(){
        var a: Int = 123//이외에 scope 내에 선언된 변수는 Local Variable 로컬변수라고 부른다.
        println(a) //코틀린은 기본변수에서 null을 허용하지않아 의도치않은 동작을 원천적으로 차단해준다.
        //만약 nullable하게 만들고싶다면 ?를 붙여서 Null 허용
        var b: Int? = null
        var intValue:Int = 1234
        var longValue:Long = 1234L
        var intValueByHex:Int = 0x1af
        var intValueByBin:Int = 0b10110110 //코틀린은 8진수 표기는 하지않는다.
        var doubleValue:Double = 123.5
        var doubleValueWithExp:Double = 123.5e10
        var floatValue:Float = 123.5f //float는 다음과 같이 f를 넣어준다.
        var charValue:Char = 'a' //UTF-16 BE를 따르고 있어서 한 글자당 16bit를 가짐.
        var charKoreanValue:Char = '가' //UTF-16
        var booleanValue:Boolean = true
        var stringValue = "one line string test"
        var multiLineStringValue = """
            string
            test
        """.trimIndent()
    }

}