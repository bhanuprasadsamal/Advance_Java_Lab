package com.mycom.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class LoginController {
	
@RequestMapping("/hello")
public ModelAndView showWelcomePage(@RequestParam(value="username") String username, @RequestParam(value="cityname") String cityname) {
    // value="username" is request parameter name
       
        System.out.println("User name is= " + username);
        System.out.println("City name is= " + cityname);
 
        ModelAndView model = new ModelAndView();
        
        model.addObject("username", username);
        model.addObject("cityname", cityname);
       
        model.setViewName("success"); // navigates to success.jsp
        
        return model;
    }
}
