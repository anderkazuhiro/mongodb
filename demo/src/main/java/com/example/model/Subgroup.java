package com.example.model;

import com.example.dto.SubgroupDTO;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Subgroup {

    @Id
    private String _id;
    private String code;
    private String name;
    private List <Function> functions;

    public Subgroup(SubgroupDTO group){
        this.code= group.getCode();
    }
    public Subgroup(String code, String name, List<Function> functions) {
        this.code = code;
        this.name = name;
        this.functions = functions;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}
