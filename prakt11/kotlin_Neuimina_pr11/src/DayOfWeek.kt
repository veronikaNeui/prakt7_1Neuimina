enum class DayOfWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    //метод 1, проверка выходной ли день
    fun isWeekend():Boolean{
        return this==Saturday || this==Sunday
    }
    //метод 2, получить следующий день
    fun nextDay(): DayOfWeek {
        val nextIndex=(this.ordinal+1)%values().size
        return values()[nextIndex]
    }
    //метод 3, получить предыдущий день
    fun previousDay(): DayOfWeek {
        val prevIndex=(this.ordinal-1+ values().size)% values().size
        return values()[prevIndex]
    }
    //метод 4, перевести на русский
    fun russianName():String{
        return when (this)
        {
            Monday->"Понедельник"
            Tuesday->"Вторник"
            Wednesday->"Среда"
            Thursday->"Четверг"
            Friday->"Пятница"
            Saturday->"Суббота"
            Sunday->"Воскресенье"
        }
    }
}
