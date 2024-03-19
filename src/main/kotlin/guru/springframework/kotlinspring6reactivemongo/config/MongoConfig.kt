package guru.springframework.kotlinspring6reactivemongo.config

import com.mongodb.MongoClientSettings
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import java.util.Collections.singletonList

@Configuration
class MongoConfig : AbstractReactiveMongoConfiguration() {
    override fun getDatabaseName() = "sfg"

    @Bean
    fun mongoClient(): MongoClient = MongoClients.create()

    override fun configureClientSettings(builder: MongoClientSettings.Builder) {
        builder.credential(MongoCredential.createCredential("root", "admin", "example".toCharArray()))
                .applyToClusterSettings { settings ->
                    settings.hosts(singletonList(
                            ServerAddress("127.0.0.1", 27017)
                    ))
                }
    }
}