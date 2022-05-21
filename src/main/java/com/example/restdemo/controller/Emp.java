package com.example.restdemo.controller;

import java.util.Arrays;
import java.util.List;

class Emp {
    String name;

    public String getName() {
        return name;
    }

    public Emp(String name) {
        this.name = name;
    }

    static List<Emp> loadData() {
        return Arrays.asList(new Emp("A"), new Emp("B"));
    }
}
