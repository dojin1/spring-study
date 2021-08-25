package com.human.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * members (Locale locale, Model m) { m.addAttribute("m_name","Jenny,Jisoo");
	 * return "members"; }
	 */
	/*
	 * @RequestMapping(value = "/next", method = RequestMethod.GET) public String
	 * home(Locale locale, Model model) {
	 * logger.info("Welcome home! The client locale is {}.", locale);
	 * 
	 * Date date = new Date(); DateFormat dateFormat =
	 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	 * 
	 * String formattedDate = dateFormat.format(date);
	 * 
	 * model.addAttribute("serverTime", formattedDate );
	 * model.addAttribute("myName","Cho Jun ho"); model.addAttribute("myCountry",
	 * "Korea"); model.addAttribute("myMobile","010-1234-5678"); return "home"; }
	 */
	
	@RequestMapping("/getinfo")
	public String getinfo( ) {
		return "getinfo";
	}
	
	@RequestMapping("/info")
	public String doInfo(HttpServletRequest hsr, Model model) {
		String uid=hsr.getParameter("userid");
		String addr=hsr.getParameter("address");
		System.out.println("uid="+uid);
		System.out.println("addr="+addr);
		model.addAttribute("loginid",uid);
		model.addAttribute("region",addr);
		return "viewinfo";
	}
	
}
