package kotlinstudy;

class Panda (name:String, birthYear:Int): Animal(name,birthYear, "판다ㅋ")
{

//    init{ //기본생성자로, 추가적인 파라미터가 필요없다.
//        println("${name}인데용")
//    }
//    constructor(name:String) :this(name, 1997){
//        println("보조 생성자가 사용됨.")
//    }
}
class Hamster(name:String): Animal(name, 1999, "햄스터 ㅋ")
{
    fun meow(){
        println("햄스터가 냐옹해보기")
    }
}

open class Animal(var name:String, var birthYear: Int, var type:String){ //수퍼클래스의
    open fun introduce(){ //open으로 열어주면 메소드 오버라이딩을 하위 클래스에서 사용할 수 있다.
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}

class Tiger() : Animal("호랑이",1999, "호랭이 ㅋ" ){
    override fun introduce(){
        println("안녕하세요, 전 오버라이딩 호랑인데용ㅋ")
    }
}

fun main(){
    var a = Panda("푸바오", 1990)
    var b = Panda("루이바오", 1999)
    var c = Panda("후이바오", 1999)

//    var d = Panda("아이바오")
//    var e = Panda("러바오")

    a.introduce()
    b.introduce()
    c.introduce()

    var d = Hamster("햄바오 ㅋ")
    d.meow()
    d.introduce()

    var t = Tiger()
    t.introduce()

}