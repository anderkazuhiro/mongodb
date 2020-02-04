package com.example.model;

import org.springframework.data.annotation.Id;

public class Function {

    @Id
    String id;
    String code;
    String description;

    public Function(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
