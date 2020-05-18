
data class AdResponse(
    val name1: Ad,
    val name2: Ad
)

data class Ad(
    val use: Boolean,
    val ads: List<AdPage>,
    val ratio: Int
)

data class AdPage(
    val image: String,
    val guide: String
)