package exercise_1

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {
//    var totalMonetaryAmount:Int? = null
//    var value:Int? = null
//    var result = 0
//
//    print("Input First Amount: ")
//    var monetaryAmount1 = readln().toIntOrNull()
//    if (monetaryAmount1 == null){
//        do{
//            logger.info { "Invalid Input" }
//            print("Please Input First Amount Again: ")
//            monetaryAmount1 = readln().toIntOrNull()
//        }while (monetaryAmount1 == null)
//    }
//    print("Input Second Amount: ")
//    var monetaryAmount2 = readln().toIntOrNull()
//    if (monetaryAmount2 == null) {
//        do {
//            logger.info { "Invalid Input" }
//            print("Please Input Second Amount Again: ")
//            monetaryAmount2 = readln().toIntOrNull()
//        } while (monetaryAmount2 == null)
//    }
//    print("Input Third Amount: ")
//    var monetaryAmount3 = readln().toIntOrNull()
//    if (monetaryAmount3 == null){
//        do{
//            logger.info { "Invalid Input" }
//            print("Please Input Third Amount Again: ")
//            monetaryAmount3 = readln().toIntOrNull()
//        }while (monetaryAmount3 == null)
//    }
//    print("Input Fourth Amount: ")
//    var monetaryAmount4 = readln().toIntOrNull()
//    if (monetaryAmount4 == null){
//        do{
//            logger.info { "Invalid Input" }
//            print("Please Input Fourth Amount Again: ")
//            monetaryAmount4 = readln().toIntOrNull()
//        }while (monetaryAmount4 == null)
//    }
//    print("Input Fifth Amount: ")
//    var monetaryAmount5 = readln().toIntOrNull()
//    if (monetaryAmount5 == null){
//        do{
//            logger.info { "Invalid Input" }
//            print("Please Input Fifth Amount Again: ")
//            monetaryAmount5 = readln().toIntOrNull()
//        }while (monetaryAmount5 == null)
//    }
//    println()
//    totalMonetaryAmount = monetaryAmount1 + monetaryAmount2 + monetaryAmount3 + monetaryAmount4 + monetaryAmount5
//    logger.info { "Total Amount: $totalMonetaryAmount" }
//    println()
//    print("Divide the value by how many?\nEnter Amount: ")
//    var divideBy = readln().toIntOrNull()
//    if (divideBy == null) {
//        do {
//            logger.info { "Invalid Input" }
//            print("Please Input Amount Again: ")
//            divideBy = readln().toIntOrNull()
//        } while (divideBy == null)
//    }
//    value = divideBy
//    result = totalMonetaryAmount / value
//    println()
//    logger.info { "Total value: $result" }
//}




    print("Input First Amount: ")
    var monetaryAmount1 = readln().toIntOrNull()
    if (monetaryAmount1 == null){
        do{
            logger.info { "Invalid Input" }
            print("Please Input First Amount Again: ")
            monetaryAmount1 = readLine()!!.toIntOrNull()
        }while (monetaryAmount1 == null)
    }
//    if(hasCough || hasFever || temperature >37){
//        println("Do not enter")
//    }else{
//        println("Will enter")
//    }
}