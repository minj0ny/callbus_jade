package com.callbus.jade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestaurantController {

    @GetMapping(value = "/restaurant/recommend/")
    @ResponseBody
    public String recommendRestaurant() {
        return "GONY'S";
    }
}
