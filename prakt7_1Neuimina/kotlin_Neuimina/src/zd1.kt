fun main(){
    try{
        var a1:Double
        print("Введите первый член (а1): ")
        a1= readLine()!!.toDouble()
        var a5:Double
        print("Введите первый член (а5): ")
        a5= readLine()!!.toDouble()
        var n:Double
        print("Введите первый член (n): ")
        n= readLine()!!.toDouble()
        if (a1==null||a5==null||n==null||n<=0)
        {
            println("Ошибка ввода данных")
            return
        }
        else
        {
            val d = (a5 - a1) / 4.0
            val an = a1 + (n - 1) * d
            val sumn = n * (a1 + an) / 2.0
            println("Разность d=%.2f".format(d))
            println("a${n}=%.2f".format(an))
            println("S${n}=%.2f".format(sumn))
        }

    }catch (e:NumberFormatException)
    {
        println("Ошибка. Вы ввели не число")
    }
}
