fun main(){
    try{
        val g=9.8    //ускорение свободного падения
        var h:Double
        print("Введите высоту (в метрах): ")
        h= readLine()!!.toDouble()
        if (h<0)
        {
            print("Ошибка. Высота не может быть отрицательной")
            return
        }
        else if (h==0.0)
        {
            println("Камень уже лежит на земле")
            println("Время падения: 0 секунд")
            return
        }
        else {
            val t: Double
            t = Math.sqrt(2 * h / g)
            println("Высота падения: $h")
            println("Время падения: %.2f".format(t) + " секунд")
        }
    }catch(e:NumberFormatException)
    {
        println("Введите числа")
    }
}
