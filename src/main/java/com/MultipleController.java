package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MultipleController {
	@RequestMapping("/multipleCont")
	@ResponseBody
	public String multipleCont(){
		return "I am calling from another controller.";
	}
}
