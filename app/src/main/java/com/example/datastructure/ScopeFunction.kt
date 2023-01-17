package com.example.datastructure

import java.util.LinkedList
import java.util.Scanner
import java.util.Stack

class ScopeFunction {
}

fun main() {
    val person = Person()
    person.apply {
        person.agr = 20
        person.name = "shivam"
    }

    println(person)

    val stack = Stack<String>()
    stack.apply {
        push("shivam")
        push("dave")
        push("balake")
        push("drake")
    }

    val linkedlist = LinkedList<String>()
    stack.let { println(stack) }

//    var scanner = Scanner(System.`in`)
//     val input =scanner.nextInt()
//     println("input by user is  ->> $input")


}

data class Person(var agr:Int =0,var name:String ="")

class Car{

  private val ai:Ai by lazy {
      Ai()
  }

}

class Ai{

}