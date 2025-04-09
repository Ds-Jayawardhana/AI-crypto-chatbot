package com.example.cryptobot.service;

import com.example.cryptobot.response.ApiResponse;
import org.springframework.stereotype.Service;


@Service
public interface ChatBotService {

    @Override
    ApiResponse getCoinDetails(String prompt){
        return null;
    }

    @Override
    String simpleChat(String prompt){
        

    }
}
