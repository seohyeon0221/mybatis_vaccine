package com.example.mybatis_vaccine.service;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import com.example.mybatis_vaccine.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    BoardMapper mapper;

    public void save(ReservationDTO dto) {
        mapper.save(dto);
    }
}
