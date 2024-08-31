package kotlinstudy

class RunnerMain {
}
interface Runner{
    fun run()
}

interface Eater {
    fun eat(){
        println("음식을 먹는다.")
    }
}
class Panda2 : Runner, Eater{
    override fun run() {
        println("호다닥 뜁니다")
    }
}
fun main(){
    var p = Panda2()

    p.eat()
    p.run()
}