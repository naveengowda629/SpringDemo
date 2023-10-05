package com.example.SpringsDemo.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringController {
	
	@GetMapping("/h")
	public void savaData() {
		System.out.println("hello");
	}
}
