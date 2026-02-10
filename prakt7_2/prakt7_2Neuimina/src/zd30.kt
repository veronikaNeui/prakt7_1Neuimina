fun main(){
    try{
        var x1:Double
        print("Введите координаты первой вершины (х1): ")
        x1=readLine()!!.toDouble()
        var y1:Double
        print("Введите координаты первой вершины (y1): ")
        y1=readLine()!!.toDouble()
        var x2:Double
        print("Введите координаты второй вершины (х2): ")
        x2=readLine()!!.toDouble()
        var y2:Double
        print("Введите координаты второй вершины (y2): ")
        y2=readLine()!!.toDouble()
        val left=minOf(x1,x2)
        val right=maxOf(x1,x2)
        val bottom=minOf(y1,y2)
        val top=maxOf(y1,y2)
        val width=when {
            right<=0.0 ->0.0
            //весь прямоугольник слева от оси Оу
            left >=0.0->right-left
            //весь прямоугольник в области х>=0
            else->right-0.0
            //пересекает ось Оу: от 0 до right
        }
        val height=when {
            top<=0.0->0.0
            //весь прямоугольник ниже оси Ох
            bottom>=0.0->top-bottom
            //весь прямоугольник в области у>=0
            else->top-0.0
            //пересекает ось Ох: от 0 до top
        }
        val area=width*height
        println("Площадь части прямоугольника в I координатной четверти: ${area}")
    }catch(e:NumberFormatException)
    {
        println("Ошибка. Введены неверные данные")
    }
}
