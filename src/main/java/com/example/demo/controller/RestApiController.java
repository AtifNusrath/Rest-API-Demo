package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserData;


@RestController
@RequestMapping("/hello")
public class RestApiController {
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello From Bridgelabz..";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(name= "name")String name){
        return "Hello "+ name +" From Bridgelabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }
    
    @PostMapping("/post")
	public String sayHello(@RequestBody UserData user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
	}
}
