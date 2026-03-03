open class MobileOperator:MobileOperatorBase {
    private val qualityQ:Double
    constructor(operatorName: String?, costPerMinute:Double, coverageArea:Double) : super(operatorName,costPerMinute,coverageArea)
    {
        this.qualityQ=calculateQualityQ()
    }
    constructor(operatorName:String,costPerMinute:Double) : this (operatorName,costPerMinute,0.0)

    override fun calculateQualityQ(): Double {
        return 100.0*coverageArea/costPerMinute
    }
    override fun displayInfo() {
        println("Информация об операторе: ")
        println("Название: $operatorName")
        println("Стоимость одной минуты: $costPerMinute")
        println("Площадь покрытия: $coverageArea")
        println("Качество (Q):%.2f".format(qualityQ))
    }
}