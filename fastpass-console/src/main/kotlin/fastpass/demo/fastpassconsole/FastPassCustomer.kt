package fastpass.demo.fastpassconsole

import java.math.BigDecimal

class FastPassCustomer(
    var fastPassId: String,
    var customerFullName: String,
    var fastPassPhone: String,
    var currentBalance: BigDecimal
) {
}