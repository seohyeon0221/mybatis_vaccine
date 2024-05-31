package com.example.mybatis_vaccine.controller;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import com.example.mybatis_vaccine.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    //새로운 예약 등록하기
    @GetMapping("/reservation")
    public String newReservation(){
        return "new";
    }

    //새로운 예약 등록
    @PostMapping("/reservation")
    public String newReservation(ReservationDTO dto){
        reservationService.save(dto);
        System.out.println(dto.toString());
        return "redirect:/";
    }
}
