package tollrate.demo.tollrateservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class TollrateServiceApplication

fun main(args: Array<String>) {
    runApplication<TollrateServiceApplication>(*args)
}
