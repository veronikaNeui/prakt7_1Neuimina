fun main(){
    try{
        var a:Double
        print("Введите первое число: ")
        a=readLine()!!.toDouble()
        var b:Double
        print("Введите второе число: ")
        b=readLine()!!.toDouble()
        var c:Double
        print("Введите третье число: ")
        c=readLine()!!.toDouble()
        val eps=1e-9
        val d1=b-a
        val d2=c-b
        when{
            Math.abs(d1-d2)<eps ->{
                println("Являются последовательными членами арифметической прогрессии. Разность d=$d1")
            }
            else -> {
                println("Не являются членами арифметической прогрессии")
            }
        }
    }catch(e:NumberFormatException)
    {
        println("Ошибка. Введены неверные данные")
    }
}
