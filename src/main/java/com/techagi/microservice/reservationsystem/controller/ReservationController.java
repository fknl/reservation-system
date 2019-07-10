package com.techagi.microservice.reservationsystem.controller;

import com.techagi.microservice.reservationsystem.entity.ReservationInfo;
import com.techagi.microservice.reservationsystem.external.ReservationServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ReservationServiceProxy reservationServiceProxy;

    @PostMapping("/reservation")
    public ReservationInfo createReservation(@RequestBody ReservationInfo reservation){
        ReservationInfo reservationInfo = reservationServiceProxy.reserve(reservation);
        return  reservationInfo;
    }







}
