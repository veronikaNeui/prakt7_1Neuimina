fun main(){
    try{
        var k1: Double
        print("Введите значение k1: ")
        k1 = readLine()!!.toDouble()
        var b1: Double
        print("Введите значение b1: ")
        b1 = readLine()!!.toDouble()
        var k2: Double
        print("Введите значение k2: ")
        k2 = readLine()!!.toDouble()
        var b2: Double
        print("Введите значение b2: ")
        b2 = readLine()!!.toDouble()
        var e: Double
        print("Введите значение e: ")
        e = readLine()!!.toDouble()
        when {
            k1==k2 && b1==b2 ->
            {
                val d=Math.abs(b1)/Math.sqrt(k1*k1+1)
                if (d<e)
                {
                    println("Прямые совпадают и проходят через е-окресность")
                }
                else{
                    println("Прямые совпадают, но не заходят в е-окресность")
                }
            }
            k1==k2 -> {
                println("Прямые параллельны. Точек пересечения нет")
            }
            else ->
            {
                val x0=(b2-b1)/(k1-k2)
                val y0=k1*x0+b1
                val distance=Math.sqrt(x0*x0+y0*y0)
                if (distance<e)
                {
                    println("Точка пересечения ($x0,$y0) находится в е-окресности")
                }
                else{
                    println("Точка пересечения ($x0,$y0) находится вне е-окресности")
                }
            }
        }

    }catch(e:NumberFormatException)
    {
        println("Ошибка. Введены неверные данные")
    }
}