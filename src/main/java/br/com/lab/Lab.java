package br.com.lab;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class Lab {

	@GetMapping("/test")
	public String lab() {
		return "Lab: " + new Date(); 
	}
	
	@GetMapping("/")
	public String code(@RequestParam("code") String code) {
		return "code: " + code; 
	}
	
}
