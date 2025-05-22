package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("/")
    public String getGreetin() {
        return new String("도서 카탈로그에 오신 것을 환영합니다. -WSL2");
    }
    
}
