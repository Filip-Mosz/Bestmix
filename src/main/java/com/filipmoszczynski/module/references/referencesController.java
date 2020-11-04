package com.filipmoszczynski.module.references;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class referencesController {

    @RequestMapping("/references")
    public String getReferences(){
        return "references";
    }

}
