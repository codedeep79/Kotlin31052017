/**
 * Created by TRUNGNGUYENHAU on 5/31/2017.
 */

fun main(args:Array<String>)
{
    var num1:Int = 10 + 10
    var num2:Int
    var str1:String = "100" + "100"
    num2 = str1.toInt()

    var num2Float:Float
    num2Float = str1.toFloat()

    var pi:Double = 3.14
    var piToInt:Int = pi.toInt()

    println("Number 1: " + num1)
    println("Number 2: " + num2)
    println("Number 2 - Data type: Float - " + num2Float)
    println("Number 3: " + piToInt)
}