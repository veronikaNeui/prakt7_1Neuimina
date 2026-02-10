fun main(){
    try{
        var a:Double
        print("Введите значение а: ")
        a= readLine()!!.toDouble()
        var b:Double
        print("Введите значение b: ")
        b= readLine()!!.toDouble()
        var c:Double
        print("Введите значение c: ")
        c= readLine()!!.toDouble()
        val p=(a+b+c)/2.0
        val s=Math.sqrt(p*(p-a)*(p-b)*(p-c))
        if (s<=0)
        {
            println("Ошибка. Площадь не может быть отрицательной или равной нулю")
            return
        }
        val r=s/p
        val R=(a*b*c)/(4.0*s)
        println("Радиус вписанной окружности r=%.2f".format(r))
        println("Радиус описанной окружности R=%.2f".format(R))

    }catch (e:NumberFormatException)
    {
        println("Ошибка. Вы ввели не число")
    }
}
