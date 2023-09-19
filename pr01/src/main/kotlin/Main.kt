import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //1
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1 // через инкримент

    //2
    var MyAge: Int = 18
    println(MyAge)

    //3
    var averageAge: Double = 18.0
    averageAge = ( (averageAge + 30) / 2 )
    exercisesSolved += 1

    //4
    val testNumber: Int = 28
    var evenOdd = testNumber % 2 // с помощью % мы находим остаток от деления на число
    println(evenOdd)

    //5
    var answer: Int = 0
    val otvet : Int = (answer + 1 + 10)*3 shr 3 // смещение вправо на три
    println(otvet)

    //6

    var age2: Int
    age2 = 16
    print(age2) // используем var тк age переприсваевается
    age2 = 30
    print(age2)

    //7

    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b //4610
    val answer2: Int = (a * 100) + (b * 100) //5600
    val answer3: Int = (a * 100) + (b / 10) //4601

    //8
    ((5*3)-((4/2)*2))


    //9

    val a2: Double = 46.2
    val b2: Double = 6.3
    val average = (a2+b2) / 2 // результат среднего арифмитического помещаем в константу average

    //10

    val fahrenheit: Double = 22.9
    val celcius = (fahrenheit - 32) / 1.8
     // что бы из °F в °С перевести нужно поменять знаки и порядок действий


    //12

    val degrees: Double = 180.0
    var radians: Double = degrees * PI / 180
    // присвоить начальное значение и вычислить угол в радианах, после сохранить результат в новую константу


    //13
    val x1: Double = 4.5
    val y1: Double = 2.4
    val x2: Double = 3.4
    val y2: Double = 5.2
    val distance: Double = sqrt(((x1 - x2) * (x1 - x2)) + ((x1 - x2) * (x1 - x2)))
}