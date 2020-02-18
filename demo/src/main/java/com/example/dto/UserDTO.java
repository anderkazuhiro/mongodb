package com.example.dto;

import com.example.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {
    private String company_cnpj;
    private String user_cpf;
    private String email;
    private String password;
    private List<GroupDTO> group;

    public UserDTO(String company_cnpj, String user_cpf, String email, String password, List<GroupDTO> group) {
        this.company_cnpj = company_cnpj;
        this.user_cpf = user_cpf;
        this.email = email;
        this.password = password;
        this.group = group;
    }

    public UserDTO(User user) {
        this.company_cnpj = user.getCompany_cnpj();
        this.user_cpf = user.getUser_cpf();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.group = user.getGroup().stream().map(GroupDTO::new).collect(Collectors.toList());
    }

    public String getCompany_cnpj() {
        return company_cnpj;
    }

    public void setCompany_cnpj(String company_cnpj) {
        this.company_cnpj = company_cnpj;
    }

    public String getUser_cpf() {
        return user_cpf;
    }

    public void setUser_cpf(String user_cpf) {
        this.user_cpf = user_cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GroupDTO> getGroup() {
        return group;
    }

    public void setGroup(List<GroupDTO> group) {
        this.group = group;
    }

}
