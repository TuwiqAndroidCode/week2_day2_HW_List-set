fun main (){
    //Part I
    var favouriteCity = mutableListOf("soul" , "bossan" , "tokyo")
    favouriteCity.addAll(listOf("Makkah","Riyadh"))
    favouriteCity[favouriteCity.size-1]= "al-madinah"
    for (num in 0 until favouriteCity.size){
        println("$num - ${favouriteCity[num]}")
    }

  //Part II
    var numbers = mutableListOf(11 , 77 , 80 ,90 , 100)
    numbers[2]=12
    // println(numbers)
    numbers.removeIf { num-> num.equals(12) }
    println(numbers)
    //optional question
    val fileReader = File("data/data.text").readText().split("\n")
    println(fileReader)
}