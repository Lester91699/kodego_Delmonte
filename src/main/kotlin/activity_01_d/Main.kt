package activity_01_d

/*
01_D......................................................
Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”.
It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done.
 */

fun main() {
    var monetaryAmount1:Int? = null
    var monetaryAmount2:Int? = null
    var monetaryAmount3:Int? = null
    var monetaryAmount4:Int? = null
    var monetaryAmount5:Int? = null
    var totalMonetaryAmount:Int? = null
    var value:Int? = null
    var result = 0

    print("First Amount: ")
    monetaryAmount1 = readLine()!!.toInt()
    print("Second Amount: ")
    monetaryAmount2 = readLine()!!.toInt()
    print("Third Amount: ")
    monetaryAmount3 = readLine()!!.toInt()
    print("Fourth Amount: ")
    monetaryAmount4 = readLine()!!.toInt()
    print("Fifth Amount: ")
    monetaryAmount5 = readLine()!!.toInt()

    totalMonetaryAmount = monetaryAmount1 + monetaryAmount2 + monetaryAmount3 + monetaryAmount4 + monetaryAmount5
    println("Total Amount: $totalMonetaryAmount")

    print("Divide the value by how many? ")
    value = readLine()!!.toInt()

    result = totalMonetaryAmount / value

    println("Total value: $result")








}