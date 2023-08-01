package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class MyController {
    @Get("/")
    public MyRecord index() {
        return new MyRecord("bar");
    }

    public record MyRecord(String foo) {
    }
}
