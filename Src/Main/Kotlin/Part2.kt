//part 2
import java.io.File
fun  main() {
//1-Create a list of integer with 5 elements
    val list=mutableListOf(1,2,3,4,5)
    println(list)
// 2- update the 3th element to 12
    list[2]=12
    println(list)
// 3-  check if the 12  existing
    list.forEachIndexed { _, item -> if (item == 12) println("$item is found") }
// 4- delete the element
    list.removeIf{
            item ->
        item == 12
    }

// 5- finally print the list
    println(list)
//****************************************(Options)********************************************
//Create a text file and read it,Create a list of 10 number
    val list2 = File("Data/MaxNum.text").readLines().toMutableList()
    //val list2 = File("Data/MaxNum.Text").readText().split("/n")
    println(list2)
    //create a for loop then create new variable named max then check
    // if the elements greater than max or not.
    // like what we have done in the max number in if condition
    var max = list2 [list2.size-1]
    for (index in 0 .. list2.size-1 ){
        if(max < list2[index]) {  max=list2[index]}
    }
    // return the maximum number
    println("the list = $list2 , and the Max value is = $max")

}







