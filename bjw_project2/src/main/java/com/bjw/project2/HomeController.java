package com.bjw.project2;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {	

		return "home";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		DBCommon<User> db = new DBCommon<User>("C:\\workspace\\Spring\\User.sqlite","User");
		model.addAttribute("message","디비생성");
		return "create";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {	

		return "join";
	}
	
	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertaction(Locale locale, Model model,
			@RequestParam("id") String id,
			@RequestParam("pwd") String pwd,
			@RequestParam("name") String name,
			@RequestParam("phone") String phone,
			@RequestParam("sex") String sex,
			@RequestParam("address") String address,
			) {	

		return "message";
	}
	
}
