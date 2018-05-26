package com.nawak.taxisBus.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/nawak")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return name;
    }
}

