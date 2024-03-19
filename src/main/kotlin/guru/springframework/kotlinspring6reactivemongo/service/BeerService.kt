package guru.springframework.kotlinspring6reactivemongo.service

import guru.springframework.kotlinspring6reactivemongo.model.BeerDTO
import reactor.core.publisher.Mono

interface BeerService {
    fun saveBeer(beerDTO: Mono<BeerDTO>): Mono<BeerDTO>
    fun getbyId(beerId:String): Mono<BeerDTO>

}