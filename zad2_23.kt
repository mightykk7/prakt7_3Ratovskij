fun main(){
    try{
        println("Введите x")
        val x = readLine()!!.toDouble()
        println("Введите y")
        val y = readLine()!!.toDouble()
        val result = when {
            (x >= -3 && x <= 1) && (y >= -1 && y <= 1) && (Math.abs(x) + Math.abs(y) <= 2) -> println("Точка принадлежит области а")
            (x >= -1 && x <= 1) && (y >= -2 && y <= 2) && (Math.abs(x) + Math.abs(y) <= 2) -> println("Точка принадлежит области б")
            (x >= -1 && x <= 1) && (y >= -1 && y <= 2) && (y >= 0 || Math.sqrt(x * x + y * y) <= 1) -> println("Точка принадлежит области в")
            (x >= -2 && x <= 1) && (y >= -2 && y <= 1) && (Math.abs(x) + Math.abs(y) <= 2) -> println("Точка принадлежит области г")
            else -> println("Точка не принадлежит ни одной из областей")
        }
        println(result)
    }catch (e: NumberFormatException) {
        println("Ошибка")
    }
}