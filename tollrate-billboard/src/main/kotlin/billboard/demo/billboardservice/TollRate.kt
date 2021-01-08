package billboard.demo.billboardservice

import java.math.BigDecimal

class TollRate(
    var stationId: Int,
    var currentRate: BigDecimal,
    var timestamp: String
) {

}