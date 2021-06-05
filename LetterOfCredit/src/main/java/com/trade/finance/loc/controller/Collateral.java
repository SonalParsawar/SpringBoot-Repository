package com.sonal.cbx.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/getCollateralDetails")
public class Collateral {

    @GetMapping("/fetch")
    public ResponseEntity<String> getCollateral (){
        System.out.println(">>>>Success");
        return new ResponseEntity<>("good", HttpStatus.OK);
    }
}
