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

import com.chinatelecom.constants.ReturnValue;
import com.chinatelecom.model.User;
import com.chinatelecom.service.LoginService;
import com.chinatelecom.utils.Encryptor;

@Controller
@RequestMapping("/loginManager")
public class LoginWebservice {
	
	private static Logger logger = LoggerFactory.getLogger(LoginWebservice.class);
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/isLogin",method=RequestMethod.POST)
	public Object isLogin(HttpServletRequest request,@RequestParam(value = "nameid", required = false) String name
			,@RequestParam(value = "param", required = false) String passwd){
		User op=new User();
		if(name!=null&&passwd!=null){
			//passwd=Encryptor.encrypt(passwd);
			op=loginService.loginUser(name, passwd);
			if(op!=null){
				request.getSession().setAttribute("username", op.getNAME());
			}
			else{
				return "login";
				//return ReturnValue.empty;
			}
		}
		else{
			return "login";
			//return ReturnValue.error;
		}
		return "main";
		//return ReturnValue.succed;
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
}
