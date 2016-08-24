package com.chinatelecom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatelecom.interceptor.Encryptor;
import com.chinatelecom.model.User;
import com.chinatelecom.service.LoginService;

@Controller
@RequestMapping("/loginManager")
public class LoginWebservice {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/isLogin",method=RequestMethod.POST)
	public String isLogin(HttpServletRequest request,@RequestParam(value = "name", required = false) String name
			,@RequestParam(value = "passwd", required = false) String passwd){
		User op=new User();
		if(name!=null&&passwd!=null){
			passwd=Encryptor.encrypt(passwd);
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
	@RequestMapping("/quit")
	public void quit(HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();//防止创建Session 
        if(session == null&&request.getAttribute("username")==null){  
            response.sendRedirect("/InternetManagement/page/login.html");
        }            
        session.removeAttribute("username"); 
        session.invalidate();
        response.sendRedirect("/InternetManagement/page/login.html");  
	}
}
