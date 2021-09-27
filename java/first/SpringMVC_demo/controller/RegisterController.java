package first.SpringMVC_demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import first.SpringMVC_demo.controller.model.User;


@Controller
public class RegisterController {
	
	@RequestMapping(value="/registerProcess")
	public ModelAndView registerProcess(HttpServletResponse response, @ModelAttribute("user") User user) throws IOException{
		 ModelAndView mav = new ModelAndView("login");
		 mav.addObject("user", user);
		 return mav;
		    
	}
	
}
