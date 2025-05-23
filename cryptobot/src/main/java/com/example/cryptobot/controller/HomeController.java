package com.example.cryptobot.controller;


import com.example.cryptobot.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public ResponseEntity<ApiResponse>Home(){

        ApiResponse response=new ApiResponse();
        response.setMessage("Welcome to AI Chatbot");
        return new ResponseEntity<>(response, HttpStatus.OK);


    }
}
