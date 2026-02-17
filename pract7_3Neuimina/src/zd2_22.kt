fun main(){
    try{
        var a:Double
        print("Введите число a: ")
        a= readLine()!!.toDouble()
        var b:Double
        print("Введите число b: ")
        b= readLine()!!.toDouble()
        var c:Double
        print("Введите число c: ")
        c= readLine()!!.toDouble()
        when{
            a==0.0&&b==0.0&&c==0.0 ->
            {
                println("Бесконечно много решений (0==0)")
            }
            a==0.0&&b==0.0 -> {
                println("Нет решений")
            }
            a==0.0 ->
            {
                val x=-c/b
                println("Линейное уравнение: 1 корень")
                println("x=$x")
            }
            else ->
            {
                val d=b*b-4*a*c
                println("Дискриминант D=$d")
                when{
                    d>0 ->
                    {
                        val x1=(-b+Math.sqrt(d))/(2*a)
                        val x2=(-b-Math.sqrt(d))/(2*a)
                        println("Два действительных корня")
                        println("x1=$x1")
                        println("x2=$x2")
                    }
                    d==0.0 -> {
                        val real=-b/(2*a)
                        val imag=Math.sqrt(-d)/(2*a)
                        println("x1=$real+${imag}")
                        println("x2=$real-${imag}")
                    }
                }
            }
        }
    }catch (e:NumberFormatException)
    {
        println("Введите числа")
    }
}
