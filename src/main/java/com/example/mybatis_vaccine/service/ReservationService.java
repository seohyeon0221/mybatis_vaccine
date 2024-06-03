package com.example.mybatis_vaccine.service;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import com.example.mybatis_vaccine.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ReservationService {
    @Autowired
    BoardMapper mapper;

    public void save(ReservationDTO dto) {
        mapper.save(dto);
    }

    public List<Map<String,Object>> findAll() {
        return mapper.findAll();
    }



    public List<Map<String, Object>> search(String type, String keyword) {
        List<Map<String, Object>> dtoList = new ArrayList<>();
        switch (type){
            case "resv_no":
                dtoList = mapper.findByResvNo(keyword);
                break;
            case "name":
                dtoList = mapper.findByName(keyword);
        }
        return dtoList;
    }
}
