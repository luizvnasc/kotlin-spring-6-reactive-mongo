package guru.springframework.kotlinspring6reactivemongo.domain

import java.math.BigDecimal
import java.time.LocalDateTime

data class Beer(
        var id: Int,
        var beerName: String,
        var beerStyle: String,
        var upc : String,
        var quantityOnHand: Int,
        var price: BigDecimal,
        var createdDate: LocalDateTime,
        var lastModifiedDate: LocalDateTime
) {}