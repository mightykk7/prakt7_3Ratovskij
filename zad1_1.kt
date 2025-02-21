fun main(){
    try{
    println("Введите сопротивление 3 конденцаторов")
    val r1 = readLine()!!.toInt()
    val r2 = readLine()!!.toInt()
    val r3 = readLine()!!.toInt()
    var allr = 0.0;
    when{
        (r1<=0 || r2<=0 || r3<=0) -> {
            println("Сопротивления должны быть положительными")
            return
        }
        else -> allr = 1.0/(1.0/r1+1.0/r2+1.0/r3)
    }
    println("Общее сопротивление: $allr Ом")
    }catch (e: NumberFormatException) {
        println("Ошибка")
    }
}