package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
/*
 * CMD> netstat -nao|find "8080"
 * CMD> taskkill /F /PID 6344
 */
public class SpringBootController {
	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "Hello World.... good work.. best of luck...";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootController.class, args);
	}
}
