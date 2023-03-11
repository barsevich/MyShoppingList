package barsevich.com.example.myshoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(ShopItemId: Int):ShopItem{
        return shopListRepository.getShopItem(ShopItemId)
    }
}