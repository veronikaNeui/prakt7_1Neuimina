class SimpleDisplayable (
    private val message:String
        ):Displayble {
    override fun displayInfo() {
        println("Простое сообщение: $message")
    }
}