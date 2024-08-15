package com.ganjasofthouse.ksiegarwin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Krzysztof {

    @GetMapping("/czyJestGejem")
    String czyJestGejem() {
        return "TAK";
    }

}