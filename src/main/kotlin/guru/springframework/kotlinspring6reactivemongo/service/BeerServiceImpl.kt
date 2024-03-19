package guru.springframework.kotlinspring6reactivemongo.service

import guru.springframework.kotlinspring6reactivemongo.mapper.BeerMapper
import guru.springframework.kotlinspring6reactivemongo.model.BeerDTO
import guru.springframework.kotlinspring6reactivemongo.repository.BeerRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono


@Service
class BeerServiceImpl(
        val beerMapper: BeerMapper,
        val beerRepository: BeerRepository
) : BeerService {
    override fun saveBeer(beerDTO: Mono<BeerDTO>): Mono<BeerDTO> = beerDTO
            .map { dto -> beerMapper.beerDTOToBeer(dto) }
            .flatMap { beer -> beerRepository.save(beer) }
            .map { beer -> beerMapper.beerToBeerDTO(beer) }

    override fun getbyId(beerId: String): Mono<BeerDTO> {
        TODO("Not yet implemented")
    }
}