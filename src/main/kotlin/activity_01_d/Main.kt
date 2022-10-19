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

    print("Input First Amount: ")
    var monetaryAmount1 = readLine()!!.toIntOrNull()
    if (monetaryAmount1 == null){
        do{
            logger.info { "Invalid Input" }
            print("Please Input First Amount Again: ")
            monetaryAmount1 = readLine()!!.toIntOrNull()
        }while (monetaryAmount1 == null)
    }
    print("Input Second Amount: ")
    var monetaryAmount2 = readLine()!!.toIntOrNull()
    if (monetaryAmount2 == null) {
        do {
            logger.info { "Invalid Input" }
            print("Please Input Second Amount Again: ")
            monetaryAmount2 = readLine()!!.toIntOrNull()
        } while (monetaryAmount2 == null)
    }
    print("Input Third Amount: ")
    var monetaryAmount3 = readLine()!!.toIntOrNull()
    if (monetaryAmount3 == null){
        do{
            logger.info { "Invalid Input" }
            print("Please Input Third Amount Again: ")
            monetaryAmount3 = readLine()!!.toIntOrNull()
        }while (monetaryAmount3 == null)
    }
    print("Input Fourth Amount: ")
    var monetaryAmount4 = readLine()!!.toIntOrNull()
    if (monetaryAmount4 == null){
        do{
            logger.info { "Invalid Input" }
            print("Please Input Fourth Amount Again: ")
            monetaryAmount4 = readLine()!!.toIntOrNull()
        }while (monetaryAmount4 == null)
    }
    print("Input Fifth Amount: ")
    var monetaryAmount5 = readLine()!!.toIntOrNull()
    if (monetaryAmount5 == null){
        do{
            logger.info { "Invalid Input" }
            print("Please Input Fifth Amount Again: ")
            monetaryAmount5 = readLine()!!.toIntOrNull()
        }while (monetaryAmount5 == null)
    }

    println()
    val totalMonetaryAmount = monetaryAmount1 + monetaryAmount2 + monetaryAmount3 + monetaryAmount4 + monetaryAmount5
    logger.info { "Total Amount: $totalMonetaryAmount" }
    println()
    print("Divide the value by how many?\nEnter Amount: ")
    var divideBy = readLine()!!.toIntOrNull()
    if (divideBy == null) {
        do {
            logger.info { "Invalid Input" }
            print("Please Input Amount Again: ")
            divideBy = readLine()!!.toIntOrNull()
        } while (divideBy == null)
    }

    val result = totalMonetaryAmount / divideBy
    println()
    logger.info { "Total value: $result" }
}