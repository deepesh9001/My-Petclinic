package com.deepesh.mypetclinic.controllers;

import com.deepesh.mypetclinic.services.MyService;

public class SomeController {
    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
