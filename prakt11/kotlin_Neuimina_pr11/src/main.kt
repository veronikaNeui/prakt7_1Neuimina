fun main() {
    println("Дни недели")
    println("Введите день недели на английском: ")
    val today = readLine()
    try {
        val day = DayOfWeek.valueOf(today.toString())
        println("Сегодня: ${day.name}")
        println("По-русски: ${day.russianName()}")
        println("Выходной? ${if (day.isWeekend()) "Да" else "Нет"}")
        println("Завтра будет: ${day.nextDay()}")
        println("Вчера было: ${day.previousDay()}")
    }
    catch (e:IllegalArgumentException){
        println("Ошибка, дня '$today' не существует")
    }
    println()
    println("Цвета радуги")
    println("Введите цвет на английском: ")
    val colorInput = readLine()
    try {
        val color = Color.valueOf(colorInput.toString())
        println("Цвет: ${color.name}")
        println("По-русски: ${color.russianName()}")
        println("Номер цвета: ${color.ordinal}")
        println("Hex-код: ${color.hexCode()}")
        println("Теплый цвет? ${if (color.isWarm()) "Да" else "Нет"}")
        println("Следующий цвет: ${color.nextColor()}")
    }
    catch (e:IllegalArgumentException){
        println("Ошибка, цвета '$colorInput' не существует")
    }

    println()
    println("Статус пиццы")
    println("Доступные статусы: Accepted, Preparing, Baking, Ready, Delivered, Delivering, Cancelled")
    println("Введите статус на английском: ")
    val statusInput= readLine()
    try {
        val status = OrderStatus.valueOf(statusInput.toString())
        println("Статус: ${status.name}")
        println("Описание: ${status.description()}")
        println("Номер статуса (позиция): ${status.ordinal}")
        println("Можно отменить? ${if (status.canCancel()) "Да" else "Нет"}")
        println("Заказ готов? ${if (status.isReady()) "Да" else "Нет"}")
        println("Следующий статус: ${status.nextStatus().name}")

        if (status.nextStatus()!=status)
        {
            println("${status.nextStatus().description()}")
        }
    }
    catch (e:IllegalArgumentException){
        println("Ошибка, статуса '$statusInput' не существует")
    }
}
