import kotlin.math.roundToInt

//базовый класс
open class DairyProduct {
    var name: String = ""
    var weight: Double = 0.0
    var fatContent: Double = 0.0
    var manufacturer: String = ""
    var price: Double = 0.0
    constructor()

    constructor(name: String, weight: Double, fatContent: Double, manufacturer: String, price: Double) {
        this.name = name
        this.weight = weight
        this.fatContent = fatContent
        this.manufacturer = manufacturer
        this.price = price
    }
    open fun inputData() {
        print("Введите название: ")
        name = readLine().toString()
        print("Введите вес (кг): ")
        weight = readLine()!!.toDouble()
        print("Введите жирность (%): ")
        fatContent = readLine()!!.toDouble()
        print("Введите производителя: ")
        manufacturer = readLine().toString()
        print("Введите цену (руб): ")
        price = readLine()!!.toDouble()
    }

    open fun displayInfo() {
        println("$name | Вес: $weight кг | Жирность: $fatContent% | Произв: $manufacturer | Цена: $price руб")
    }
    //функция 1, расчет цены за 1 кг
    fun pricePerKg() = if (weight > 0) price / weight else 0.0
    //функция 2, проверка является ли продукт диетическим
    fun isDietary() = fatContent < 2.5
    //функция 3, округление цены до целого числа
    fun roundPrice() = price.roundToInt()


}