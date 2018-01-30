package com.jarzasa.madridshops.domain.model

/**
*  Shop: represents one shop
*/
data class Shop(val id: Int, val name: String, val address: String) {
    init {
        Shops(ArrayList<Shop>())
    }
}

/**
 *  Shops: represents a list of shops
 */
class Shops(val shops: MutableList<Shop>): Aggregate<Shop> {

    override fun count(): Int = shops.size

    override fun all(): List<Shop> = shops

    override fun get(position: Int): Shop = shops.get(position)

    override fun add(element: Shop) {
        shops.add(element)
    }

    override fun delete(position: Int) {
        shops.removeAt(position)
    }

    override fun delete(element: Shop) {
        shops.remove(element)
    }


}
