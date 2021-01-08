package fastpass.demo.fastpassconsole

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class FastpassConsoleApplication

fun main(args: Array<String>) {
    runApplication<FastpassConsoleApplication>(*args)
}
