fun main(){
    try{
        var x:Double
        print("Введите значение x: ")
        x= readLine()!!.toDouble()
        var y:Double
        print("Введите значение y: ")
        y= readLine()!!.toDouble()

        val a=Math.pow(Math.sin(x),2.0)+Math.pow(Math.cos(Math.pow(y,3.0)),2.0)
        if (a<=0)
        {
            println("Ошибка. Нельзя вычислить корень из отрицательного числа")
            return
        }
        val result=Math.sqrt(a)
        println("Результат=%.3f".format(result))

    }catch (e:NumberFormatException)
    {
        println("Ошибка. Вы ввели не число")
    }
}
