package com.test.practice.service;

import com.test.practice.dto.ResponseDTO;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

    public ResponseDTO response() {
        return ResponseDTO.builder().message("This is test kinda hello").build();
    }
}
