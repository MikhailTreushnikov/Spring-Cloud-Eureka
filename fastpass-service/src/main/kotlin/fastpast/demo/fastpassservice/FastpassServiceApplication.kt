package fastpast.demo.fastpassservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class FastpassServiceApplication

fun main(args: Array<String>) {
    runApplication<FastpassServiceApplication>(*args)
}
