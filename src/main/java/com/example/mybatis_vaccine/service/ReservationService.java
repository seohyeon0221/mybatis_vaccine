package com.example.mybatis_vaccine.service;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import com.example.mybatis_vaccine.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
