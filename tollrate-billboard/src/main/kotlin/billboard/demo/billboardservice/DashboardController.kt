package billboard.demo.billboardservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate


@Controller
class DashboardController(
    val restTemplate: RestTemplate
) {

    @RequestMapping("/dashboard")
    fun getTollRate(@RequestParam stationId: Int, m: Model): String? {

        val tr = restTemplate.getForObject(
            "http://toll-service/tollrate/$stationId",
            TollRate::class.java
        )
        println("stationId: $stationId")
        m.addAttribute("rate", tr!!.currentRate)
        return "dashboard"
    }
}