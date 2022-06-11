package com.example.InventoryApplication.data

class ItemService(val db: ItemRepository) {
    fun findItems(): List<Item> = db.findItems()
    fun findByItem(item: String): Iterable<Item> = db.findByItem(item)
    fun post(item: Item){
        db.save(item)
    }
}