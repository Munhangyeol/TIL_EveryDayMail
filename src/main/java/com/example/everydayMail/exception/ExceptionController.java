package com.example.everydayMail.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/exception")
public class ExceptionController {
    private final ExceptionService service;

    @RequestMapping("/ex1")
    public String excuteEx1(@RequestParam("param")int param){
        String str;
        try {
            str=service.isNumEqualFiveWithException(param);
        }
        catch (Exception e){
            return "exception";
        }
        return str;
    }
    @RequestMapping("/ex2")
    public String excuteEx2(@RequestParam("param")int param){
        return service.isNumEqualFiveWithRuntimeException(param);

    }
}
