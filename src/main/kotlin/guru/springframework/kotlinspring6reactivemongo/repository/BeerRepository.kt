package guru.springframework.kotlinspring6reactivemongo.repository

import guru.springframework.kotlinspring6reactivemongo.domain.Beer
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BeerRepository : ReactiveMongoRepository<Beer, String>