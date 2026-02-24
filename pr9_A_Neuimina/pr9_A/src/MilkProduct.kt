class MilkProduct {
    var id: Int = 0
    var title: String = ""
    var amount: Double = 0.0
    var fat: Double = 0.0
    var brand: String = ""
    var cost: Double = 0.0

    constructor()
    constructor(id: Int, title: String, amount: Double, fat: Double, brand: String, cost: Double) {
        this.id = id; this.title = title; this.amount = amount
        this.fat = fat; this.brand = brand; this.cost = cost
    }
    fun display() = println("  $id: $title, ${amount}кг, ${fat}%, $brand, ${cost}руб")
    fun pricePerKg() = if (amount > 0) cost / amount else 0.0
}
