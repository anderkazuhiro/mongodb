package com.example.dto;

import com.example.model.Group;
import com.example.model.Subgroup;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupDTO {

    private String code;
    private List<SubgroupDTO> subgroupDTO;

    public GroupDTO(Group group){
        this.code = group.getCode();
        this.subgroupDTO = group.getSubgroup().stream().map(SubgroupDTO::new).collect(Collectors.toList());
    }
    public GroupDTO(String code, List<SubgroupDTO> subgroupDTO) {
        this.code = code;
        this.subgroupDTO = subgroupDTO;
    }


    public List<SubgroupDTO> getSubgroupDTO() {
        return subgroupDTO;
    }

    public void setSubgroupDTO(List<SubgroupDTO> subgroupDTO) {
        this.subgroupDTO = subgroupDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
