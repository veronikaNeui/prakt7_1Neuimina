class MobileOperatorWithPayment(
        operatorName: String?,
        costPerMinute:Double,
        coverageArea:Double,
        val hasPaymentPerConnection: Boolean //наличие платы за каждое соединение (доп поле P)
        ) : MobileOperator (operatorName,costPerMinute,coverageArea)
{
        override fun calculateQualityQ(): Double {
                val baseQuality=super.calculateQualityQ()
                return if (hasPaymentPerConnection)
                {
                        0.7*baseQuality
                }
                else
                {
                        1.5*baseQuality
                }
        }
        override fun displayInfo(){
        super.displayInfo()
        println("Наличие платы за соединение: ${if(hasPaymentPerConnection) "Да" else "Нет"}")
                println("Качество(Qp): ${calculateQualityQ()}")
        }
}