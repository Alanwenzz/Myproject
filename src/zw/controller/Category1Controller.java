package zw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zw.pojo1.Ccategory1;
import zw.service1.Category1Service;

@Controller
public class Category1Controller {
	@Autowired
	public Category1Service c1s;
	@RequestMapping("/index")
	public ModelAndView handleRequest(Ccategory1 cc) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", c1s.get(cc).getName());
        return mav;
	}
}
