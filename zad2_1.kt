fun main(){
    try{
        println("Введите y")
        val y = readLine()!!.toDouble()
        var f = 0.0
        when{
            (y>2)->f = y+2
            (y<1)->f = Math.pow(y,2.0)+2*y+0.3
            ((1<=y) && (y<=2))->f = Math.pow(y,3.0)+2*Math.pow(y,2.0)+0.3*y+1
        }
        println("f(y) = $f")
    }catch (e: NumberFormatException) {
        println("Ошибка")
    }
}