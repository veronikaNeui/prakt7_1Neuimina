typealias BasicDairy = DairyProduct
typealias FermentedMilk = Yogurt
typealias ProductA = MilkProduct
typealias ProductB = DairyItem

//главная функция
fun main() {
    //пользователь вводит массив продуктов
    println("создание массива молочных изделий")
    val dairyArray = mutableListOf<DairyProduct>()
    print("\nСколько продуктов хотите добавить? ")
    val count = readLine()!!.toInt()

    for (i in 1..count) {
        println("\nПродукт №$i:")
        println("Выберите тип:")
        println("  1 - Обычный молочный продукт")
        println("  2 - Йогурт")
        println("  3 - Сыр")
        println("  4 - Мороженое")
        print("Ваш выбор: ")

        when (readLine()!!.toInt()) {
            1 -> {
                val product = DairyProduct()
                product.inputData()
                dairyArray.add(product)
            }
            2 -> {
                val yogurt = Yogurt()
                yogurt.inputData()
                dairyArray.add(yogurt)
            }
            3 -> {
                val cheese = Cheese()
                cheese.inputData()
                dairyArray.add(cheese)
            }
            4 -> {
                val iceCream = IceCream()
                iceCream.inputData()
                dairyArray.add(iceCream)
            }
            else -> {
                println("Неверный выбор, создан обычный продукт")
                val product = DairyProduct()
                product.inputData()
                dairyArray.add(product)
            }
        }
    }

    println("\nвсе введенные продукты")
    if (dairyArray.isEmpty()) {
        println("Массив пуст")
    } else {
        dairyArray.forEachIndexed { i, product ->
            println("\n${i + 1}. ${product.name}")
            product.displayInfo()
            when (product) {
                is Yogurt -> {
                    product.breakfast()
                    product.servingTip()
                }
                is Cheese -> {
                    product.winePair()
                    product.storage()
                }
                is IceCream -> {
                    product.meltingTime()
                    product.servingTip()
                }
                else -> {
                    println("Цена за кг: ${"%.2f".format(product.pricePerKg())} руб")
                    println("Диетический: ${if (product.isDietary()) "да" else "нет"}")
                }
            }
        }
    }
    println("\nдемонстрация псевдонимов")

    if (dairyArray.isNotEmpty()) {
        val basic: BasicDairy = dairyArray[0]
        println("Псевдоним BasicDairy (первый продукт):")
        basic.displayInfo()
    }
    // Находим йогурт в массиве
    val yogurtItem = dairyArray.find { it is Yogurt }
    if (yogurtItem != null) {
        val fermented: FermentedMilk = yogurtItem as Yogurt
        println("Псевдоним FermentedMilk (йогурт):")
        fermented.displayInfo()
        fermented.breakfast()
    } else {
        println("Йогурт не найден, создаем тестовый:")
        val testYogurt = Yogurt("Тестовый йогурт", 0.2, 2.5, "Тест", 50.0, "клубника", true, 80)
        val fermented: FermentedMilk = testYogurt
        fermented.displayInfo()
        fermented.breakfast()
    }

    //классы с одинаковыми свойствами
    println("\nклассы с одинаковыми свойствами")
    println("Введите данные для первого класса (MilkProduct):")
    print("ID: ")
    val id1 = readLine()!!.toInt()
    print("Название: ")
    val title1 = readLine().toString()
    print("Вес (кг): ")
    val amount1 = readLine()!!.toDouble()
    print("Жирность (%): ")
    val fat1 = readLine()!!.toDouble()
    print("Бренд: ")
    val brand1 = readLine().toString()
    print("Цена (руб): ")
    val cost1 = readLine()!!.toDouble()

    val objA: ProductA = MilkProduct(id1, title1, amount1, fat1, brand1, cost1)

    println("\nВведите данные для второго класса (DairyItem):")
    print("ID: ")
    val id2 = readLine()!!.toInt()
    print("Название: ")
    val title2 = readLine().toString()
    print("Вес (кг): ")
    val amount2 = readLine()!!.toDouble()
    print("Жирность (%): ")
    val fat2 = readLine()!!.toDouble()
    print("Бренд: ")
    val brand2 = readLine().toString()
    print("Цена (руб): ")
    val cost2 = readLine()!!.toDouble()

    val objB: ProductB = DairyItem(id2, title2, amount2, fat2, brand2, cost2)

    println("\nРезультат:")
    objA.display()
    println("Цена/кг: ${"%.2f".format(objA.pricePerKg())} руб")
    objB.display()
    println("Цена/кг: ${"%.2f".format(objB.pricePerKg())} руб")
}