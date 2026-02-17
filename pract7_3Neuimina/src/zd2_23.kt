fun main(){
    try {
        print("Введите х: ")
        var x = readLine()!!.toInt()
        print("Введите y: ")
        var y = readLine()!!.toInt()
        print("Введите номер графика(a-d): ")
        var variant = readLine()
        var result = when (variant) {
            "a" -> when {
                x in -3..1 && y in -1..1 -> "Принадежит обасти а"
                else -> "Не принадежит области а"
            }
            "b" -> when {
                x in -1..1 && y in -2..2 -> "Принадлежит области b"
                else -> "Не принадлежит b"
            }
            "c" -> when {
                x in -1..1 && y in -1..2 -> "Принадлежит области c"
                else -> "Не принадлежит c"
            }
            "d" -> when {
                x in -2..1 && y in -2..1 -> "Принадлежит области d"
                else -> "Не принадлежит d"
            }
            else -> "Ошибка"
        }
        println("$result")
    }catch(e:NumberFormatException)
    {
        println("Введите числа")
    }
}
