class Cheese:DairyProduct {
    var maturity: String = ""
    var hasMold: Boolean = false
    var type: String = ""
    constructor() : super()
    constructor(name: String, weight: Double, fat: Double, manuf: String, price: Double,
                maturity: String, hasMold: Boolean, type: String) : super(name, weight, fat, manuf, price) {
        this.maturity = maturity
        this.hasMold = hasMold
        this.type = type
    }
    override fun inputData() {
        super.inputData()
        print("Выдержка: ")
        maturity = readLine().toString()
        print("С плесенью (да/нет): ")
        hasMold = readLine()!!.lowercase() == "да"
        print("Тип (твердый/мягкий): ")
        type = readLine().toString()
    }
    override fun displayInfo() {
        super.displayInfo()
        println("Выдержка: $maturity | Плесень: ${if (hasMold) "да" else "нет"} | Тип: $type")
    }
    //рекомендации по вину
    fun winePair() = when {
        hasMold -> println("Сыр '$name' прекрасно сочетается с белым вином")
        type == "твердый" -> println("Сыр '$name' отлично подходит к красному вину")
        else -> println("Сыр '$name' прекрасно подходит к любому вину")
    }
    //для каких блюд подходит
    fun cookingIdeas(){
        when (type) {
            "твердый" -> println("Отлично подходит для пиццы или пасты")
            "мягкий" -> println("Отлично подходит для бутербродов и салатов")
        }
    }
    //условия хранения
    fun storage() = println("Сыр '$name' хранить в холодильнике +2...+6°C")
}
