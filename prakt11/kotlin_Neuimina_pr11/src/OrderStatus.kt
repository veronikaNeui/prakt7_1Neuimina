enum class OrderStatus {
    Accepted,
    Preparing,
    Baking,
    Ready,
    Delivered,
    Delivering,
    Cancelled;
    //метод 1, можно ли отменить заказ
    fun canCancel():Boolean{
        return this==Accepted||this==Preparing
    }
    //метод 2, готов ли заказ к выдаче
    fun isReady():Boolean{
        return this==Ready||this==Preparing
    }
    //метод 3, следующий статус
    fun nextStatus(): OrderStatus {
        if (this==Cancelled||this==Delivered)
        {
            return this
        }
        val nextIndex=this.ordinal+1
        return values()[nextIndex]
    }
    //метод 4, описание статуса клиента
    fun description():String{
        return when (this){
            Accepted->"Заказ принят, скоро начнем готовить"
            Preparing->"Готовим ваш заказ"
            Baking->"Заказ в печи"
            Ready->"Заказ готов, ждем курьера"
            Delivering->"Курьер везет заказ"
            Delivered->"Заказ доставлен! Приятного аппетита"
            Cancelled->"Заказ отменен"
        }
    }
}
