package com.example.restdemo.controller;


import org.apache.tomcat.util.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;


@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/emp")
    public List<Emp> getAllEmp() {

        abar();

        //logger.info("yeee: " + Emp.loadData());
        return Emp.loadData();
    }

    private void abar() {
        try {
            throw new RuntimeException("hello java");
        } catch (Exception e) {
            String s = Arrays.toString(e.getStackTrace());
            logger.info(">>> "+s);

        }
    }
}
