package tollrate.demo.tollrateservice

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator
import org.springframework.stereotype.Component

@Component
class CustomHealthCheck: HealthIndicator{

    private var errorecode: Int = 0

    override fun health(): Health {
        println("health check performed. error code is $errorecode")

        if(errorecode>4 && errorecode<8){
            errorecode++
            return Health.down().withDetail("Custom Error Code", errorecode).build()
        }
        errorecode++;
        return Health.up().build()
    }
}