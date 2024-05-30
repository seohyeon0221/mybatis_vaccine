package com.example.mybatis_vaccine.mapper;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    void save(ReservationDTO dto);
}
