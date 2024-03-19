package guru.springframework.kotlinspring6reactivemongo.model

import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

data class CustomerDTO(
        var id: String,
        @NotBlank
        var customerName: String,
        var createdDate: LocalDateTime,
        var lastModifiedDate: LocalDateTime
)