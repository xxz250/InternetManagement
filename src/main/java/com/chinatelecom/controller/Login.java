package com.chinatelecom.controller;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatelecom.model.User;
import com.chinatelecom.service.LoginService;

@Controller
@RequestMapping("/loginf")
public class Login {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/logins",method=RequestMethod.POST)
	public String islogin(HttpServletRequest request,@RequestParam(value = "name", required = false) String name
			,@RequestParam(value = "passwd", required = false) String passwd){
		User op=new User();
		if(name!=null&&passwd!=null){
			passwd=Base64.getEncoder().encodeToString(passwd.getBytes());
			op=loginService.loginUser(name, passwd);
			if(op!=null){
				request.getSession().setAttribute("username", op.getNAME());
			}
			else{
				return "login";
			}
		}
		else{
			return "login";
		}
		return "main";
	}
	/*@RequestMapping(value = "/handle",method=RequestMethod.POST)
	public ModelAndView islogin(@RequestParam(value = "name", required = false) String name
			,@RequestParam(value = "passwd", required = false) String passwd,HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		User op=new User();
		if(name!=null&&passwd!=null){
			op=loginService.loginUser(name, passwd);
			if(op!=null){
				request.getSession().setAttribute("username", op.getNAME());
			}
			else{
				return new ModelAndView("login");
			}
		}
		else{
			return new ModelAndView("login");
		}
		return new ModelAndView("main");
	}*/
}
