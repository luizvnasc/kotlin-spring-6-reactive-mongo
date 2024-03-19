package guru.springframework.kotlinspring6reactivemongo.model

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.math.BigDecimal
import java.time.LocalDateTime

data class BeerDTO(
        var id: Int,
        @NotBlank
        @Size(min = 3, max = 255)
        var beerName: String,
        @Size(min = 3, max = 255)
        var beerStyle: String,
        @Size(max = 255)
        var upc: String,
        var quantityOnHand: Int,
        var price: BigDecimal,
        var createdDate: LocalDateTime,
        var lastModifiedDate: LocalDateTime
) {
}