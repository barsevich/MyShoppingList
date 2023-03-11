package barsevich.com.example.myshoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(ShopItem: ShopItem)

    fun getShopItem(ShopItemId: Int):ShopItem

    fun getShopList():List<ShopItem>



}