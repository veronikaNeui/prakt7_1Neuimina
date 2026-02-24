class Yogurt:DairyProduct {
    var flavor: String = ""
    var hasAdditives: Boolean = false
    var calories: Int = 0
    constructor() : super()

    constructor(name: String, weight: Double, fat: Double, manuf: String, price: Double,
                flavor: String, hasAdd: Boolean, cal: Int) : super(name, weight, fat, manuf, price) {
        this.flavor = flavor
        this.hasAdditives = hasAdd
        this.calories = cal
    }
    override fun inputData() {
        super.inputData()
        print("Вкус: ")
        flavor = readLine().toString()
        print("Добавки (да/нет): ")
        hasAdditives = readLine()!!.lowercase() == "да"
        print("Калорийность: ")
        calories = readLine()!!.toInt()
    }
    override fun displayInfo() {
        super.displayInfo()
        println("Вкус: $flavor | Добавки: ${if (hasAdditives) "да" else "нет"} | $calories ккал")
    }
    //рекомендации для завтрака
    fun breakfast() = println("Йогурт '$name' отлично подходит для завтрака!")
    //проверка на полезность
    fun isHealthy() = calories < 100 && fatContent < 3.0
    //совет по употреблению
    fun servingTip() = if (hasAdditives) println("Можно есть сразу") else println("Добавьте фрукты")
}
