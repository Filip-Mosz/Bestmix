package com.filipmoszczynski.module.international;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternationalController {

    @GetMapping("/international")
    public String getInternational() {
        return "international";
    }
}
