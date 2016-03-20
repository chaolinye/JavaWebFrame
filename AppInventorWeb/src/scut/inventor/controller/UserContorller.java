package scut.inventor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scut.inventor.entity.User;
import scut.inventor.service.UserService;

@Controller
@RequestMapping("/user")
public class UserContorller {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletRequest response){
		System.out.println("登录验证");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println("userName:"+userName);
		System.out.println("password:"+password);
		User user=new User();
		user.setUserName(userName);
		user.setPassword(password);
		User currentUser=userService.findUserByNameAndPassword(user);
		if(currentUser!=null){
			request.getSession().setAttribute("user", currentUser);
			return "main";
		}else{
			return "fail";
		}
	}
}
