package com.anchen.partyHistory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @GetMapping("/getScoringDetails")
    public ResponseEntity<String> test (){
        return new ResponseEntity<>("testing ",HttpStatus.OK );
    }
}
