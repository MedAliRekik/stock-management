package com.stockmanagement.controller;

import com.stockmanagement.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    public String index(){
        return "clients";}
}
