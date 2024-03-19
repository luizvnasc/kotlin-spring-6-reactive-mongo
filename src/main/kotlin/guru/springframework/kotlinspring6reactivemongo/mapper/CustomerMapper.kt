package guru.springframework.kotlinspring6reactivemongo.mapper

import guru.springframework.kotlinspring6reactivemongo.domain.Customer
import guru.springframework.kotlinspring6reactivemongo.model.CustomerDTO
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustomerMapper {
    fun customerToCustomerDTO(customer: Customer): CustomerDTO
    fun customerDTOToCustomer(customerDTO: CustomerDTO): Customer
}