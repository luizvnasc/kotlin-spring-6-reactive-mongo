package guru.springframework.kotlinspring6reactivemongo.mapper

import guru.springframework.kotlinspring6reactivemongo.domain.Beer
import guru.springframework.kotlinspring6reactivemongo.model.BeerDTO
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface BeerMapper {
    fun beerToBeerDTO(beer: Beer): BeerDTO
    fun beerDTOToBeer(beerDTO: BeerDTO): Beer
}