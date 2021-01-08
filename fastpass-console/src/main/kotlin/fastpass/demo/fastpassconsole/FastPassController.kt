package fastpass.demo.fastpassconsole

import org.springframework.stereotype.Controller
import org.springframework.web.client.RestTemplate

import org.springframework.ui.Model

import org.springframework.web.bind.annotation.RequestParam

import org.springframework.web.bind.annotation.RequestMapping


@Controller
class FastPassController (private val restTemplate: RestTemplate){

    @RequestMapping(path = ["/customerdetails"], params = ["fastpassid"])
    fun getFastPassCustomerDetails(@RequestParam fastpassid: String, m: Model): String? {
        val c = restTemplate.getForObject(
            "http://fastpass-service/fastpass/$fastpassid",
            FastPassCustomer::class.java
        )
        println("retrieved customer details")
        m.addAttribute("customer", c)
        return "console"
    }
}