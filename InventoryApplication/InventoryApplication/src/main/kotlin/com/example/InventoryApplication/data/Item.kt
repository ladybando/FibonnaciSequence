package com.example.InventoryApplication.data

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Table("Item")
data class Item(
    val id: Int? = 0,
    val itemName: String,
    val itemPrice: Double,
    val stockQuantity: Int
)
@Repository
interface ItemRepository : CrudRepository<Item, String>{
    @Query("select * from item")
    fun findItems(): List<Item>

    @Query("select name from item")
    fun findByItem(item: String): Iterable<Item>
}