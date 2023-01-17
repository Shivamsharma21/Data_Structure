package com.example.datastructure

import java.util.LinkedList

fun main(){
    println("linked list")

   val linked_list = LinkedList<Int>()

    linked_list.addFirst(1)
    linked_list.add(2)
    linked_list.add(3)
    linked_list.add(4)
    linked_list.add(5)
    linked_list.addLast(10)
    linked_list.peekFirst()?.let { println(it) }
    linked_list.pop()?.let { println(it) }
    linked_list.addFirst(1)
     println(linked_list)
}



