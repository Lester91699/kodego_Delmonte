package activity_01_d

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

/*
01_D......................................................
Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”.
It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.
Note: Error checking must be done.
 */

fun main() {
    print("Enter First Amount: ")
    var monetaryAmount1 = readln().toIntOrNull()
    print("Enter Second Amount: ")
    var monetaryAmount2 = readln().toIntOrNull()
    print("Enter Third Amount: ")
    var monetaryAmount3 = readln().toIntOrNull()
    print("Enter Fourth Amount: ")
    var monetaryAmount4 = readln().toIntOrNull()
    print("Enter Fifth Amount: ")
    var monetaryAmount5 = readln().toIntOrNull()

    var totalMonetaryAmount:Int? = null
    var value:Int? = null
    var result = 0

    if (monetaryAmount1 == null){
        do{
            logger.error{ "Invalid Input" }
            monetaryAmount1 = readln().toIntOrNull()
        }while (monetaryAmount1 == null)
    }
    if (monetaryAmount2 == null) {
        do {
            logger.error { "Invalid Input" }
            monetaryAmount2 = readln().toIntOrNull()
        } while (monetaryAmount2 == null)
    }
    if (monetaryAmount3 == null){
        do{
            logger.error{ "Invalid Input" }
            monetaryAmount3 = readln().toIntOrNull()
        }while (monetaryAmount3 == null)
    }
    if (monetaryAmount4 == null){
        do{
            logger.error{ "Invalid Input" }
            monetaryAmount4 = readln().toIntOrNull()
        }while (monetaryAmount4 == null)
    }
    if (monetaryAmount5 == null){
        do{
            logger.error{ "Invalid Input" }
            monetaryAmount5 = readln().toIntOrNull()
        }while (monetaryAmount5 == null)
    }
    totalMonetaryAmount = monetaryAmount1 + monetaryAmount2 + monetaryAmount3 + monetaryAmount4 + monetaryAmount5
    println("Total Amount: $totalMonetaryAmount")
    print("Divide the value by how many?\nEnter Amount: ")
    var divideBy = readln().toIntOrNull()
    if (divideBy == null) {
        do {
            logger.error { "Invalid Input" }
            divideBy = readln().toIntOrNull()
        } while (divideBy == null)
    }
    value = divideBy
    result = totalMonetaryAmount / value
    logger.info { "Total value: $result" }
}