fun main(){
    try{
        println("Введите внутрений радиус")
        val r1 = readLine()!!.toDouble()
        println("Введите внешний радиус")
        val r2 = readLine()!!.toDouble()
        var s =0.0
        when{
            (r1>=r2)-> {
                println("внутрений радиус должен быть меньше внешнего")
                return;
            }
            (r1<=0 || r2<=0) -> {
                println("Радиусы должны быть положительными")
                return
            }
            else -> s = 3.14*(Math.pow(r2,2.0)-Math.pow(r1,2.0))
        }
        println("Площадь кольца равна $s")
    }catch (e: NumberFormatException) {
        println("Ошибка")
    }
}