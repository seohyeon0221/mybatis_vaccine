package com.example.mybatis_vaccine.mapper;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {
    void save(@Param("dto") ReservationDTO dto);
}
