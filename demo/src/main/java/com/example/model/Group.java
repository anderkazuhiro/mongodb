package com.example.model;

import com.example.dto.GroupDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "Group")
public class Group {

    @Id
    private String id;
    private String code;
    private String group;
    private List<Subgroup> subgroup;

    public Group(GroupDTO group){
        this.code = group.getCode();
        this.subgroup = group.getSubgroupDTO()!=null ? group.getSubgroupDTO().stream().map(Subgroup::new).collect(Collectors.toList()):null;
    }

    public Group(String code, String group, List<Subgroup> subgroup) {
        this.code = code;
        this.group = group;
        this.subgroup = subgroup;
    }

    public String getId() {
        return id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Subgroup> getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(List<Subgroup> subgroup) {
        this.subgroup = subgroup;
    }
}
