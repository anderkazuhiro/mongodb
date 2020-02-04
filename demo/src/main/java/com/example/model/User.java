package com.example.model;

import com.example.dto.UserDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "User")
public class User {

    @Id
    private String id;
    private String company_cnpj;
    private String user_cpf;
    private String email;
    private String password;
    private List<Group> group;

    public User(String company_cnpj, String user_cpf, String email, String password, List<Group> group) {
        this.company_cnpj = company_cnpj;
        this.user_cpf = user_cpf;
        this.email = email;
        this.password = password;
        this.group = group;
    }

    public User(UserDTO userDTO) {
        this.company_cnpj = userDTO.getCompany_cnpj();
        this.user_cpf = userDTO.getUser_cpf();
        this.email = userDTO.getEmail();
        this.password = userDTO.getPassword();
        this.group = userDTO.getGroup().stream().map(Group::new).collect(Collectors.toList());
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

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}