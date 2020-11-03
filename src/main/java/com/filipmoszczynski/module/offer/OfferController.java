package com.filipmoszczynski.module.offer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

    @RequestMapping("/offer")
    public String getOffer(){
        return "offer";
    }
}

//demeter BlogController
