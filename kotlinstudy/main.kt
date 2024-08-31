package kotlinstudy

fun main(){
    for (i in 0..9 step 3){ //파이썬 처럼 하면 되는듯.
        print(i)
    }

    for (j in 9 downTo 0){
        print(j)
    }

    loop@for (k in 0..9){
        for (j in 1..10){
            if (k==1 && j==2) break@loop //이렇게 레이블을 달아주면 저 레이블 달린 바깥 for문을 종료 시킬 수 있다.
            println("k: $k, j: $j")
        }
    }
}