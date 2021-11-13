package com.anchen.partyHistory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @GetMapping("/testMethod")
    public ResponseEntity<String> test (){
        return new ResponseEntity<>("修改一个中文，有一次修改 testing ",HttpStatus.OK );
    }
}
