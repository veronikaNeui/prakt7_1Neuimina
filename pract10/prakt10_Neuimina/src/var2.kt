fun main(){
    val operatorsList= mutableListOf<MobileOperatorBase>()
    println("Введите данные для 3-х операторов: ")

    for (i in 1..3) {
        println("Ввод данных для оператора $i ")
        print("Введите название оператора: ")
        val name= readLine()
        print("Введите стоимость 1 минуты (руб): ")
        val cost= readLine()!!.toDouble()
        print("Введите площадь покрытия: ")
        val area= readLine()!!.toDouble()
        print("Есть ли плата за соединение: ")
        val hasPaymentInput= readLine()!!.lowercase()
        val hasPayment=when (hasPaymentInput) {
            "Да", "да", "yes", "Yes"->true
            else->false
        }



        operatorsList.add(MobileOperatorWithPayment(name,cost,area,hasPayment))

        for (operator in operatorsList)
        {
            operator.displayInfo()
            println("--------------------")
        }
    }
}