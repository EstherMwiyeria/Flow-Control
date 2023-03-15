fun main() {

    randomInt()
    classifier(6)
    classifier(14)
    classifier(26)
    var y = countries(arrayOf("Rwanda","Senegal","Kenya","Uganda","Tanzania"))
    println(y)
    multipleNumber()



}
// 1. Create a function that prints out all the odd numbers between 1 and 100
fun randomInt() {
    for (num in 1..100) {

        if (num % 2 !=0) {
            println(num)
        }

    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun countries(nam:Array<String>): Int{
    var add = 0
    for (x in nam){
        if(x.length>5){
            add++
        }
    }
    return add
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun classifier(age: Int) {
    if (age in 0..6) {
        println("milk")
    } else if (age in 7..14) {
        println("fanta orange")

    } else {
        println("coca cola")
    }
}


//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun multipleNumber(){
    for(number in 1..100)
    when{
        number % 3 == 0 ->
            println("Fizz")
        number % 5 == 0 ->
            println("Buzz")
        number %3 == 0 && number %5 == 0 ->
            println("FizzBuzz")

    }




}



