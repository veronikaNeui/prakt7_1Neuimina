fun main(){
    try{
        var d:Double
        print("Введите длину диагонали: ")
        d= readLine()!!.toDouble()
        var a:Double
        print("Введите длину большего основания(а): ")
        a= readLine()!!.toDouble()
        if (d<=0||a<=0)
        {
            println("Ошибка. значения не могут быть отрицатеьными")
            return
        }
        else if (d<=a)
        {
            println("Ошибка. диагональ должна быть боьше основания")
            return
        }
        else{
            val b=Math.sqrt(d*d-a*a)
            val s=a*b
            println("большее основание: $a")
            println("диагональ: $d")
            println("меньшее основание: $b")
            println("площадь прямоугоьника: $s")
        }
    }catch (e:NumberFormatException)
    {
        println("Введите числа")
    }
}
