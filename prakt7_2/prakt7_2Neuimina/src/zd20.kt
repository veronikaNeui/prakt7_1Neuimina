fun main() {
    try {
        var graph: Int
        print("Введите номер графика (1, 2, 3): ")
        graph = readLine()!!.toInt()
        var a: Double
        print("Введите число: ")
        a = readLine()!!.toDouble()
        val result = when (graph) {
            1 -> {
                1.0 - Math.abs(a) }
            2 -> {
                a - Math.abs(a)
            }
            3 -> {
                val r: Double
                print("Введите R: ")
                r = readLine()!!.toDouble()
                if (Math.abs(a) <= r) {
                    Math.sqrt(r * r - a * a)
                } else {
                    0.0
                }
            }
            else -> {
                println("Неправильный номер графика")
                return
            }
        }
    println("f(a)=%.3f".format(result))
    }catch(e:NumberFormatException)
    {
        println("Ошибка. Введены неверные данные")
    }
}
