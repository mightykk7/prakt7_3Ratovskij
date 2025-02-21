import kotlin.math.max
import kotlin.math.min

fun main(){
    try{
        println("Введите a")
        val a = readLine()!!.toDouble()
        println("Введите b")
        val b = readLine()!!.toDouble()
        println("Введите c")
        val c = readLine()!!.toDouble()
        println("Введите u")
        val u = readLine()!!.toDouble()
        println("Введите v")
        val v = readLine()!!.toDouble()
        when{
            (a==0.0)->{
                println("Коэффициент а не может быть равен нулю")
                return
            }
        }
        val xcritical = -b/(2*a)
        val ycritical = a*Math.pow(xcritical,2.0)+b*xcritical+c
        val yu = a*Math.pow(u,2.0)+b*u*c
        val yv = a*Math.pow(v,2.0)+b*v*c
        var maxx = if(xcritical in u..v)max(max(yu,yv),ycritical)
        else max(yu,yv)
        var minn = if(xcritical in u..v)min(min(yu,yv),ycritical)
        else min(yu,yv)
        println("Максимальное значение функции= $maxx")
        println("Минимальное значение функции = $minn")
    }catch (e: NumberFormatException) {
        println("Ошибка")
    }
}