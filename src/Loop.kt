/**
 * Created by TRUNGNGUYENHAU on 5/31/2017.
 */
fun main(args:Array<String>){

    loop@ for(count1 in 1..10)
    {
        for(count2 in 1..10)
        {
            println("Count: $count1");
            if (count2 == 2)
                break@loop;
        }
    }
}