package com.example.InventoryApplication

import com.example.InventoryApplication.data.Item
import com.example.InventoryApplication.data.ItemRepository
import com.example.InventoryApplication.data.ItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ItemResource(@Autowired val service: ItemService){
    @GetMapping
    fun index(): List<Item> = service.findItems()

    fun indexItem(item: String): Iterable<Item> = service.findByItem(item)
    @PostMapping
    fun post(@RequestBody item: Item){
        service.post(item)
    }
    @Autowired
    lateinit var repository: ItemRepository
    @RequestMapping("/save")
    fun save() {
        repository.save(Item(1, "Apples", 5.99, 10))

    }

}