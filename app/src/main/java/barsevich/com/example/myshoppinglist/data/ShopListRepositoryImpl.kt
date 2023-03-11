package barsevich.com.example.myshoppinglist.data

import barsevich.com.example.myshoppinglist.domain.ShopItem
import barsevich.com.example.myshoppinglist.domain.ShopListRepository as ShopListRepository

object ShopListRepositoryImpl: ShopListRepository {
    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementID=0;

    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.Id==ShopItem.UNDEFINDED_ID) {
            shopItem.Id = autoIncrementID++
        }

        shopList.add(shopItem)

    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)

    }

    override fun editShopItem(shopItem: ShopItem) {
        val tmp:ShopItem
        tmp = getShopItem(shopItem.Id)
        shopList.remove(tmp)
        addShopItem(shopItem)
    }

    override fun getShopItem(ShopItemId: Int): ShopItem {
       return shopList.find {
           it.Id == ShopItemId
       } ?: throw RuntimeException("Element with id $ShopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }


}