import java.util.*

/**
 * Created by TRUNGNGUYENHAU on 5/31/2017.
 */

fun main(args:Array<String>)
{
    println("Enter Your DOB: ")
    var DOB:Int = readLine()!!.toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)

    var age = year - DOB
    println("Your old is $age years")
}