package guru.springframework.kotlinspring6reactivemongo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime

@Document
data class Beer(
        @Id
        var id: String? = null,
        var beerName: String? = null,
        var beerStyle: String? = null,
        var upc: String? = null,
        var quantityOnHand: Int = 0,
        var price: BigDecimal = BigDecimal.ZERO,
        var createdDate: LocalDateTime? = null,
        var lastModifiedDate: LocalDateTime? = null
)