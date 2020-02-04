package com.example.dto;

import com.example.model.Group;
import com.example.model.Subgroup;

public class  SubgroupDTO {
    private String code;

    public String getCode() {
        return code;
    }

    public SubgroupDTO(Subgroup subGroup){
        this.code = subGroup.getCode();
    }

    public SubgroupDTO(String code) {
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
