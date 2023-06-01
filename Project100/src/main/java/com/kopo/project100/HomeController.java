package com.kopo.project100;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpSession;

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
		DBCommon<User> db = new DBCommon<User>("C:\\kopo\\u.sqlite", "user");
		db.createTable(new User());
		
		model.addAttribute("message", "디비가 생성되었습니다.");
		return "message";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {
		return "join";
	}

	@RequestMapping(value = "/insert_action", method = RequestMethod.GET)
	public String insertAction(Locale locale, Model model, @RequestParam("id") String id, @RequestParam("pwd") String pwd, @RequestParam("pwd2") String pwd2, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("sex") String sex, @RequestParam("address") String address) {
		if (pwd.equals(pwd2)) {
			DBCommon<User> db = new DBCommon<User>("C:\\kopo\\u.sqlite", "user");
			String joined = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
			try {
				pwd = this.encrypt(pwd);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			db.insertData(new User(id, pwd, name, phone, sex, address, joined, "member"));
			model.addAttribute("message", "가입이 완료되었습니다.");
			return "redirect:/";
		} else {
			model.addAttribute("message", "패스워드가 동일하지 않습니다.");
		}
		return "message";
	}

    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model, HttpSession session) {
		if (session.getAttribute("type") == null) {
			return "redirect:/";
		}
		String type = (String) session.getAttribute("type");
		if (type.equals("admin")) {
			DBCommon<User> db = new DBCommon<User>("C:\\kopo\\u.sqlite", "user");
			ArrayList<User> result = db.selectArrayList(new User());
			String resultString = "";
			for (int i = 0; i < result.size(); i++) {
				User row = result.get(i);
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>";
				resultString = resultString + row.idx;
				resultString = resultString + "</td>";
				resultString = resultString + "<td>";
				resultString = resultString + row.id;
				resultString = resultString + "</td>";
				resultString = resultString + "<td>";
				resultString = resultString + row.name;
				resultString = resultString + "</td>";
				resultString = resultString + "<td>";
				resultString = resultString + row.phone;
				resultString = resultString + "</td>";
				resultString = resultString + "<td>";
				resultString = resultString + row.sex;
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
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";
	}

	@RequestMapping(value = "/login_action", method = RequestMethod.GET)
	public String loginAction(Locale locale, Model model, HttpSession session, @RequestParam("id") String id, @RequestParam("pwd") String pwd) {
		DBCommon<User> db = new DBCommon<User>("C:\\kopo\\u.sqlite", "user");
		try {
			pwd = this.encrypt(pwd);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		User result = db.detailsData(new User(), id, pwd);
		if (result == null) {
			model.addAttribute("message", "로그인이 실패했습니다. 아이디 패스워드를 확인해주세요.");
			session.setAttribute("type", "");
		} else {
			model.addAttribute("message", "로그인 되었습니다.");
			session.setAttribute("type", result.type);
		}
		return "message";
	}

}
