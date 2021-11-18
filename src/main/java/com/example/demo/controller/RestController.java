package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello From Bridgelabz..";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(name= "name")String name){
        return "Hello "+ name +" From Bridgelabz";
    }
    // http://localhost:8080/hello/param/Mohammed
    @GetMapping("/param/{name}")
    public String sayHelloPara(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz";
    }

    @PostMapping("/post")
	public String sayHello(@RequestBody UserData user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
	}
    // http://localhost:8080/hello/put/Mohammed?lastName=Atif
    @PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + " From Bridgelabz";
	}
}
