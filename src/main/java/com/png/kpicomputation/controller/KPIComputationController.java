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
    public String index() {

        return "Greetings from KPI Computation Service : "+  userService.getUserLastName("Pugal");
    }
}
