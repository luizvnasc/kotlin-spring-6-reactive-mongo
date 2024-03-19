package guru.springframework.kotlinspring6reactivemongo.service

import guru.springframework.kotlinspring6reactivemongo.domain.Beer
import guru.springframework.kotlinspring6reactivemongo.mapper.BeerMapper
import guru.springframework.kotlinspring6reactivemongo.model.BeerDTO
import org.awaitility.Awaitility.await
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import reactor.core.publisher.Mono
import java.math.BigDecimal
import java.util.concurrent.atomic.AtomicBoolean

@SpringBootTest
class BeerServiceImplTest {

    @Autowired
    lateinit var beerService: BeerService

    @Autowired
    lateinit var beerMapper: BeerMapper

    lateinit var beerDTO: BeerDTO


    @BeforeEach
    fun setUp() {
        beerDTO = beerMapper.beerToBeerDTO(getTestBeer())
    }

    @Test
    fun saveBeer() {
        val atomicBoolean = AtomicBoolean(false)
        val savedMono = beerService.saveBeer(Mono.just(beerDTO))
        savedMono.subscribe { dto ->
            run {
                println(dto.id)
                atomicBoolean.set(true)
            }
        }
        await().untilTrue(atomicBoolean)
    }

    companion object {
        fun getTestBeer() = Beer(
                beerName = "Space Dust",
                beerStyle = "IPA",
                price = BigDecimal.TEN,
                quantityOnHand = 12,
                upc = "123123"
        )
    }
}