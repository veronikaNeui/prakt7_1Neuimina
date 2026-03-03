abstract class MobileOperatorBase(
    val operatorName: String?,
    val costPerMinute:Double,
    val coverageArea:Double
) : Displayble {
    abstract fun calculateQualityQ():Double
}