package com.example.controller;

import com.example.dto.UserDTO;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(value = "/save",produces = {"application/json","application/xml"},
    consumes = {"application/json" , "application/xml"})
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO){
        service.salvar(userDTO);
        return (new ResponseEntity<UserDTO>( HttpStatus.OK));
    }

}
