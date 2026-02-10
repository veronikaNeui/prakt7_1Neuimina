import kotlin.math.pow

fun main() {
    try {
        var k: Double
        print("Введите значение k: ")
        k = readLine()!!.toDouble()
        var b: Double
        print("Введите значение b: ")
        b = readLine()!!.toDouble()
        var a: Double
        print("Введите значение a: ")
        a = readLine()!!.toDouble()
        var l: Double
        print("Введите значение l: ")
        l = readLine()!!.toDouble()
        val discr = k * k - 4 * a * (-b)
        val halfL = 1 / 2
        when {
            discr < 0 -> println("Точек пересечения нету")
            discr == 0.0 -> println("Только одна точка пересечения")
            discr > 0 -> {
                val x1 = (k + Math.sqrt(discr)) / (2 * a)
                val y1 = k * x1 + b
                val x2 = (k - Math.sqrt(discr)) / (2 * a)
                val y2 = k * x2 + b
                println("Координаты точек: ($x1,$y1) и ($x2,$y2)")
                //Проверка попадания в квадрат с центром (0,0) и стороной 1
                val point1In = x1 >= -halfL && x1 <= halfL && y1 >= -halfL && y1 <= halfL
                val point2In = x2 >= -halfL && x2 <= halfL && y2 >= -halfL && y2 <= halfL
                if (point1In && point2In) {
                    println("Обе точки попадают в квадрат")
                } else {
                    println("Обе точки не попадают в квадрат")
                }
            }
        }
    } catch (e: NumberFormatException) {
        println("Ошибка. Введены неверные данные")
    }
}
