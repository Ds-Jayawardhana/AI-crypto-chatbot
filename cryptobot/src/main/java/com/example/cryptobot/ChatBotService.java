package com.example.cryptobot;

import com.example.cryptobot.response.ApiResponse;

public interface ChatBotService {

    ApiResponse getCoinDetails(String prompt);

    String simpleChat(String prompt);
}
