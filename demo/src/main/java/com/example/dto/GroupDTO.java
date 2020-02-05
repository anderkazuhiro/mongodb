package com.example.dto;

import com.example.model.Group;
import com.example.model.Subgroup;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupDTO {

    private String code;
    private List<SubgroupDTO> subgroup;

    public GroupDTO(Group group){
        this.code = group.getCode();
        this.subgroup = group.getSubgroup().stream().map(SubgroupDTO::new).collect(Collectors.toList());
    }
    public GroupDTO(String code, List<SubgroupDTO> subgroup) {
        this.code = code;
        this.subgroup = subgroup;
    }


    public List<SubgroupDTO> getSubgroupDTO() {
        return subgroup;
    }

    public void setSubgroupDTO(List<SubgroupDTO> subgroupDTO) {
        this.subgroup = subgroupDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
