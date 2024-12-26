package com.example.everydayMail.exception;

import org.springframework.stereotype.Service;

@Service
public class ExceptionService {

    public String isNumEqualFiveWithException(int num) throws Exception {
        if(num!=5)
            throw new Exception();
        return "5";
    }
    public String isNumEqualFiveWithRuntimeException(int num) {
        if(num!=5)
            throw new RuntimeException();
        return "5";

    }
}
