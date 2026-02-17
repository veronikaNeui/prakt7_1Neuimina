fun main(){
    try{
        var x:Double
        print("Введите вещественное число х: ")
        x= readLine()!!.toDouble()
        var k:Int
        print("Введите целое число к: ")
        k= readLine()!!.toInt()
        var m:Int
        print("Введите целое число m: ")
        m= readLine()!!.toInt()
        var n:Int
        print("Введите целое число n: ")
        n= readLine()!!.toInt()

        val maxKN= maxOf(k,n)
        val minKN=minOf(k,n)

        val y=when{
            m==maxKN->{
                println("случай 1: m==maxKN==$maxKN")
                Math.sin(Math.abs(x))/(x*x)
            }
            m==minKN->{
                println("случай 2: m==minKN==$minKN")
                Math.sin(Math.abs(x))/(x*x+1)
            }
            else->{
                println("в остальных сучаях: m не равно ни maxKN ни minKN")
                -1.0
            }
        }
        println("max(K,N)=$maxKN")
        println("min(K,N)=$minKN")
        println("Результат: y = %.3f".format(y))

        if(m==maxKN&&x==0.0)
        {
            println("при х=0 происходит деление на ноль. Результат стремится к бесконечности")
        }

    }catch (e:NumberFormatException)
    {
        println("Введите числа")
    }
}
