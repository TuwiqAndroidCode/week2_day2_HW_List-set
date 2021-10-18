//part 1
fun main() {
//Create a list of 3 elements of your favourite city's names
    var favouriteCitys= mutableListOf("Riyadh ","Jeddah","Tabuk")
// then add more 2 elements
    favouriteCitys.addAll(listOf("Makkah","Medina"))
    println(favouriteCitys)
//then update last element
    favouriteCitys[favouriteCitys.size-1] ="Al-Medina"
    println(favouriteCitys)
// finally print the whole list with the numbers
    favouriteCitys.forEachIndexed{index ,item-> println("$index - $item") }
}