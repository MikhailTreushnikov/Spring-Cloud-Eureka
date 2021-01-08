package tollrate.demo.tollrateservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal
import java.time.Instant

@RestController
class TollRateController {

    @GetMapping("/tollrate/{stationId}")
    fun getTollRate(@PathVariable stationId: Int): TollRate {
        println("Station requested: $stationId")
        val tr: TollRate = when (stationId) {
            1 -> {
                TollRate(stationId, BigDecimal("0.55"), Instant.now().toString())
            }
            2 -> {
                TollRate(stationId, BigDecimal("1.05"), Instant.now().toString())
            }
            3 -> {
                TollRate(stationId, BigDecimal("0.60"), Instant.now().toString())
            }
            else -> {
                TollRate(stationId, BigDecimal("1.00"), Instant.now().toString())
            }
        }
        return tr
    }
}