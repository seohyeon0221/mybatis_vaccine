package com.example.mybatis_vaccine.constant;

import lombok.Getter;

@Getter
public enum HostCode {
    ONE("가_병원"),
    TWO("나_병원"),
    THREE("다_병원"),
    FOUR("라_병원");
    private String value;
    HostCode(String value){
        this.value = value;
    }

}
