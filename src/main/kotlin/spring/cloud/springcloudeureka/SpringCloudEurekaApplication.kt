package spring.cloud.springcloudeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class SpringCloudEurekaApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudEurekaApplication>(*args)
}
