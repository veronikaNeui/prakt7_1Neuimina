import kotlin.math.roundToInt
class IceCream:DairyProduct {
    var onStick: Boolean = false
    var packaging: String = ""
    var temperature: Double = -18.0

    constructor() : super()

    constructor(name: String, weight: Double, fat: Double, manuf: String, price: Double,
                onStick: Boolean, packaging: String, temp: Double) : super(name, weight, fat, manuf, price) {
        this.onStick = onStick
        this.packaging = packaging
        this.temperature = temp
    }
    override fun inputData() {
        super.inputData()
        print("На палочке (да/нет): ")
        onStick = readLine()!!.lowercase() == "да"
        print("Введите тип упаковки (стаканчик/рожок/брикет): ")
        packaging = readLine().toString()
        print("Введите температуру хранения(-18): ")
        readLine()!!.toDoubleOrNull()?.let { temperature = it }
    }
    override fun displayInfo() {
        super.displayInfo()
        println("Палочка: ${if (onStick) "да" else "нет"} | Упаковка: $packaging | $temperature°C")
    }

    //время таяния
    fun meltingTime(roomTemp: Double = 25.0): String {
        val minutes = ((temperature + 20) * 2).roundToInt()
        return if (minutes > 0) "~$minutes минут" else "менее минуты"
    }
    //совет по подаче
    fun servingTip() {
        when (packaging) {
            "рожок" -> println("Мороженое в рожке удобно есть сразу")
            "стаканчик" -> println("В стаканчик можно добавить топпинг")
            else -> println("Подавайте мороженое охлажденным")
        }
    }
    //Калорийность порции
    fun caloriesPortion() = println("Калорий: ${((fatContent * 10 + 50) * weight).roundToInt()} ккал")
}
