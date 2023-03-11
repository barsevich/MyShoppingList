package barsevich.com.example.myshoppinglist.domain

data class ShopItem(
    val Name: String,
    val Cnt: Int,
    val Enabled: Boolean,
    var Id: Int = UNDEFINDED_ID
)
{
    companion object{
        const val UNDEFINDED_ID = -1
    }
}
