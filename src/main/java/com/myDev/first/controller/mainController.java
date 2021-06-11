package com.myDev.first.controller;

import com.myDev.first.controller.dto.mainResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/main/dto")
    public mainResponseDto mainDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new mainResponseDto(name, amount);
    }
}
