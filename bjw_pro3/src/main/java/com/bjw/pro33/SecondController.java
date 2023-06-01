package com.bjw.pro33;


import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecondController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		DBCommon<Student> db = new DBCommon<Student>("C:\\workspace\\spring\\s.sqlite", "student");
		ArrayList<Student> result = db.selectArrayList(new Student());
		String resultString = "";
		for (int i = 0; i < result.size(); i++) {
			Student row = result.get(i);
			resultString = resultString + "<tr>";
			resultString = resultString + "<td>";
			resultString = resultString + row.idx;
			resultString = resultString + "</td>";
			resultString = resultString + "<td>";
			resultString = resultString + row.name;
			resultString = resultString + "</td>";
			resultString = resultString + "<td>";
			resultString = resultString + row.phone;
			resultString = resultString + "</td>";
			resultString = resultString + "<td>";
			resultString = resultString + row.address;
			resultString = resultString + "</td>";
			resultString = resultString + "<td>";
			resultString = resultString + "<a href='update?idx=" + row.idx + "'>수정</a>";
			resultString = resultString + "</td>";
			resultString = resultString + "</tr>";
		}
		model.addAttribute("list", resultString);
		return "list";
	}
}
