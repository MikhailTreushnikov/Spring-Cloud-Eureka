package fastpast.demo.fastpassservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class FastPassController() {
    private final val customerList: MutableList<FastPassCustomer> = ArrayList()

    init {
        val fc1 = FastPassCustomer("100", "Mikhail Treushnikov", "89040543333", BigDecimal(3.05))
        val fc2 = FastPassCustomer("101", "Ivan Ivanov", "89540343333", BigDecimal(2.05))
        val fc3 = FastPassCustomer("102", "Zhdan Zhdanov", "88310343243", BigDecimal(5.50))
        customerList.add(fc1)
        customerList.add(fc2)
        customerList.add(fc3)
    }

    @GetMapping("/fastpass/{fastpassId}")
    fun getFastPassById(@PathVariable fastpassId: String): FastPassCustomer {
        return customerList.filter { fastPassCustomer -> fastPassCustomer.fastPassId.equals(fastpassId) }.first()
    }

    @GetMapping("/fastpass/phone/{fastpassphone}")
    fun getFastPassByPhone(@PathVariable fastpassphone: String): FastPassCustomer {
        return customerList.filter { fastPassCustomer -> fastPassCustomer.fastPassPhone.equals(fastpassphone) }.first()
    }

}