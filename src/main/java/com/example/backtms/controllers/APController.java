package com.example.backtms.controllers;

import com.example.backtms.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APController {

    @Autowired
    AdminRepository repository;

}
