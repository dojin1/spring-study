package com.human.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/contactus",method=RequestMethod.GET)//메소드방식이 get이면 value,method 안써도됨."/contactus"
	public String method1(Model model) {
		model.addAttribute("mobile","01012345678");
		return "contactus";
	}
	
	/*
	 * 변형된 방법 (아래)
	 * @RequestMapping("/contactus") public ModelAndView method2() { ModelAndView
	 * mav = new ModelAndView(); mav.addObject("mobile","010-4567-1234");
	 * mav.setViewName("contactus"); return mav; }
	 */
}
// 새 컨트롤러 만드고(.java), Model 이용해서 전화번호 전달.-> contactus.jsp
// JSP파일에는 
// myCompany <-Title
// 저희 회사 연락처는 ....  입니다.