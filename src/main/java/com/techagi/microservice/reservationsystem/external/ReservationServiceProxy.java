package com.techagi.microservice.reservationsystem.external;

import com.techagi.microservice.reservationsystem.entity.ReservationInfo;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(name = "currency-exchange-server", url = "localhost:8000")
@FeignClient(name = "library-service")
//@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name = "library-service")
public interface ReservationServiceProxy {

    @GetMapping(value = "/reservation")
    ReservationInfo reserve(@RequestBody ReservationInfo reservationInfo);

}
