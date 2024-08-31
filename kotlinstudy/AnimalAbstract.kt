package kotlinstudy

class AnimalAbstract {
}

abstract class Animall{
    abstract fun eat()
    fun sniff(){
        println("킁킁 칭구 룡킁")
    }
}

class Rabbit : Animall(){
    override fun eat() {
        println("당근을 먹습니다")
    }
}
fun main(){
    var r = Rabbit()
    r.eat()
    r.sniff()
}
