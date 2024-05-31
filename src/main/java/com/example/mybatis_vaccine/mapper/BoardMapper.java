package com.example.mybatis_vaccine.mapper;

import com.example.mybatis_vaccine.dto.ReservationDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    void save(@Param("dto") ReservationDTO dto);


    List<Map<String, Object>> findAll();
}
