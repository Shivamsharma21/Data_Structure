package com.example.datastructure

class SearchingAlgo {
}


fun main(){

    var status = false
    val array = arrayOf(1,2,55,64,234,654,66,742,12,45,10)
    val num  = 55000
    for (i in array.indices){
        if (array[i] == num){
            println("Element found at index -> $i")
            status = true
            break
        }

    }
   if (!status){
       println("Element not found in array")
   }
}