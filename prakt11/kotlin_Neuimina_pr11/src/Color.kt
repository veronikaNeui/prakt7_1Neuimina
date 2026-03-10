enum class Color {
    Red,
    Orange,
    Yellow,
    Green,
    Blue,
    Purple;
    //метод 1, получить код цвета
    fun hexCode():String{
        return when (this){
            Red->"#FF0000"
            Orange->"#FFA500"
            Yellow->"#FFFF00"
            Green->"#00FF00"
            Blue->"#0000FF"
            Purple->"#EE82EE"
        }
    }
    //метод 2, теплый ли цвет
    fun isWarm():Boolean{
        return this==Red||this==Orange||this==Yellow
    }
    //метод 3, получить следующий цвет радуги
    fun nextColor():Color{
        val nextIndex=(this.ordinal+1)% values().size
        return values()[nextIndex]
    }
    //метод 4, перевести на русский
    fun russianName():String{
        return when(this) {
            Red->"Красный"
            Orange->"Оранжевый"
            Yellow->"Желтый"
            Green->"Зеленый"
            Blue->"Синий"
            Purple->"Фиолетовый"
        }

    }
}
