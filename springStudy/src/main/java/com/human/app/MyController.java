package com.human.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/contactus",method=RequestMethod.GET)//�޼ҵ����� get�̸� value,method �Ƚᵵ��."/contactus"
	public String method1(Model model) {
		model.addAttribute("mobile","01012345678");
		return "contactus";
	}
	
	/*
	 * ������ ��� (�Ʒ�)
	 * @RequestMapping("/contactus") public ModelAndView method2() { ModelAndView
	 * mav = new ModelAndView(); mav.addObject("mobile","010-4567-1234");
	 * mav.setViewName("contactus"); return mav; }
	 */
}
// �� ��Ʈ�ѷ� �����(.java), Model �̿��ؼ� ��ȭ��ȣ ����.-> contactus.jsp
// JSP���Ͽ��� 
// myCompany <-Title
// ���� ȸ�� ����ó�� ....  �Դϴ�.