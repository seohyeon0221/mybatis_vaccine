package com.example.mybatis_vaccine.controller;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import com.example.mybatis_vaccine.service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

@Slf4j
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

    //지역별 예약 현황 조회
    @GetMapping("/list")
    public String findAll(Model model){
        List<Map<String,Object>> dtoList = reservationService.findAll();
        model.addAttribute("dtoList", dtoList);
        return "list";
    }

    //검색 화면
    @GetMapping("/searchPage")
    public String searchPage() {
        return "search";
    }

    @GetMapping("search")
    public String search(@RequestParam("type") String type,
                         @RequestParam("keyword") String keyword,
                         Model model){
        log.info("type:" + type + "  keyword:" + keyword);
        List<Map<String,Object>> dtoList = reservationService.search(type, keyword);
        for(Map<String,Object> genderList: dtoList){
            String jumin = (String) genderList.get("jumin");
            char genderCode = jumin.charAt(7);
            String gender = "";
            if(genderCode =='1'){
                gender = "남";
            }else if(genderCode == '2'){
                gender = "여";
            }
            genderList.put("gender", gender);
        }
        model.addAttribute("dtoList", dtoList);
        return "search";
    }

}
