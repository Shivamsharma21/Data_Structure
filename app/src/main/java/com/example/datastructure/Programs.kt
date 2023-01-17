package com.example.datastructure

class Run {

}

fun main() {
    println("Main Function is called ")
   // reverseStr()
  // findDuplicateStringInTheArray()
   removeDuplicateStringInArray()
}


fun reverseStr() {
    // TODO:  method 1
    println("reverse function is called ")
    val str = "shivam"
    var revStr = str.reversed()
    println("Actual String is this $str")
    println("Reverse string is this $revStr")

    // TODO:  method 2
   revStr =""

    for ( i in str.indices.reversed()){
        revStr += str[i].toString()
    }
    println( "this is the rev string $revStr")
}

fun secondLargestNumberInArray() {
    println("Test")

    var largest = 0
    val arr = arrayOf(33, 234, 54, 32, 12, 76)
    largest = arr[0]
    var secondlargest = arr[0]

    for (i in arr.indices) {
        if (arr[i] > largest)
            largest = arr[i]
    }
    println("largest ->" + largest)

    for (i in arr.indices) {
        if (arr[i] > secondlargest) {
            if (secondlargest < largest) {
                secondlargest = arr[i]
            }
        }
    }
    println("secondlargest ->" + secondlargest)


}

fun findDuplicateStringInTheArray(){
    val array = arrayOf("s","v","i","v","a","m","m")
    for (i in 0 until array.size){
        for (j in i until array.size-1) {
            if (array[i].equals(array[j+1])){
                println("value of i ->$i value of j-> $j")
                println("duplicate found ->"+ array[i]+" "+ array[j+1])
            }
        }
    }



    }
fun removeDuplicateStringInArray() {
    // Create another array of size one less
    // Create another array of size one less

    var dupIndex = -1

    val array:ArrayList<String> = arrayListOf("s", "h", "i", "v", "a", "m", "m")
    var arrayAfterRemovingOfDuplicate = Array<String>(array.size-1,{""})

    val anotherArray = IntArray(array.size - 1)
    for (i in 0 until array.size) {
        for (j in i until array.size - 1) {
            if (array[i].equals(array[j + 1])) {
                println("value of i ->$i value of j-> $j")
                println("duplicate found ->" + array[i] + " " + array[j + 1])
                dupIndex = i
            }
        }
    }

    for (i in 0 until array.size){
         println("Loop")
        if (i == dupIndex){
//            continue
        }

        if (i !=arrayAfterRemovingOfDuplicate.size){
     arrayAfterRemovingOfDuplicate[i] =array[i]
        }

    }
    for (i in arrayAfterRemovingOfDuplicate.indices){
        println(arrayAfterRemovingOfDuplicate[i])
    }
}