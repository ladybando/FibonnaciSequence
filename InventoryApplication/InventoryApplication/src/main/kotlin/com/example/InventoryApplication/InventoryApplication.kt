package com.example.InventoryApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//https://kotlinlang.org/docs/jvm-spring-boot-restful.html#create-a-data-class-and-a-controller
@SpringBootApplication
class InventoryApplication

fun main(args: Array<String>) {
	runApplication<InventoryApplication>(*args)
}
