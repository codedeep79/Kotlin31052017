/**
 * Created by TRUNGNGUYENHAU on 5/31/2017.
 */

fun main(args:Array<String>)
{
    println("Enter Name: ")
    var _name = readLine()
    println("Enter Class")
    var _class = readLine()
    println("Enter Age: ")
    var _age:Int = readLine()!!.toInt()
    println("Enter Date Of Birth: ")
    var _dateOfBirth:Int = readLine()!!.toInt()

    println("**** OutPut ****")
    println("Name: " + _name)
    println("Class: " + _class)
    println("Age: " + _age)
    println("Date Of Birth: " + _dateOfBirth)


}
