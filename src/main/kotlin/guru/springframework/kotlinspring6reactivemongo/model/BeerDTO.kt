package guru.springframework.kotlinspring6reactivemongo.model

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.math.BigDecimal
import java.time.LocalDateTime

data class BeerDTO(
        var id: String? = null,
        @NotBlank
        @Size(min = 3, max = 255)
        var beerName: String? = null,
        @Size(min = 3, max = 255)
        var beerStyle: String? = null,
        @Size(max = 255)
        var upc: String? = null,
        var quantityOnHand: Int = 0,
        var price: BigDecimal = BigDecimal.ZERO,
        var createdDate: LocalDateTime? = null,
        var lastModifiedDate: LocalDateTime? = null
)