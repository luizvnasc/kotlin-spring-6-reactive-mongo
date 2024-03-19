package guru.springframework.kotlinspring6reactivemongo.domain

import jakarta.validation.constraints.Size
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Customer(
        @Id
        var id: String,
        @Size(max = 255)
        var customerName: String,
        @CreatedDate
        var createdDate: LocalDateTime,
        @LastModifiedDate
        var lastModifiedDate: LocalDateTime
)