package com.png.kpicomputation.controller;

import com.png.kpicomputation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KPIComputationController {

    @Autowired
    UserService userService;

    @RequestMapping("/kpi")
    public void index() {
        System.out.println("Hello World");
        //return "Greetings from KPI Computation Service : "+  userService.getUserLastName("Pugal");

    }

    public int forUnitTesting() {
        return 3;
    }
}
