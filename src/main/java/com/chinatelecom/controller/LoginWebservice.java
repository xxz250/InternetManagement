package com.chinatelecom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static Logger logger = LoggerFactory.getLogger(LoginWebservice.class);
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
/*		System.out.println("username"+request.getSession().getId());
		System.out.println("username"+request.getSession().getAttribute("username"));	*/	
		return "main";
	}
	@RequestMapping("/quit")
	public void quit(HttpServletRequest request,HttpServletResponse response){
		try {
			String username = (String) request.getSession().getAttribute("username");
			if(null!=username){
				request.getSession().removeAttribute("username");
				request.getSession().invalidate();
			}
		} catch (Exception e) {
			logger.error(e.toString());
		}finally{
			try{
				response.sendRedirect("/InternetManagement/page/login.html");			
			}catch(Exception e){
				logger.error(e.toString());
			}
		}
	}	
	/*@RequestMapping("/session")
	public void session(HttpServletRequest request,HttpServletResponse response){
		java.util.Enumeration e = request.getSession().getAttributeNames();
		while( e.hasMoreElements()) {
			String sessionName=(String)e.nextElement();
			logger.debug("\nsession item name="+sessionName);
			logger.debug("\nsession item value="+request.getSession().getAttribute(sessionName));
		}
	}*/
}
