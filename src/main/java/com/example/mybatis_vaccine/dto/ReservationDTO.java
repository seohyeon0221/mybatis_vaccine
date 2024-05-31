package com.example.mybatis_vaccine.dto;

import com.example.mybatis_vaccine.constant.HostCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@ToString
@Getter
@Setter
public class ReservationDTO {
    private Long resv_no;
    private String jumin;
    private String host_code;
    private String resv_date;
    private String resv_time;
    private String v_code;

}
