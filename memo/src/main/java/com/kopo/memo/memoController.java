package com.kopo.memo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memoController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}

