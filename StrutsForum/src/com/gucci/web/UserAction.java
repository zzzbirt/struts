package com.gucci.web;

import org.apache.struts2.ServletActionContext;

import com.gucci.domain.User;
import com.gucci.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	public User user = new User();

	public String abc() {
		return null;
	}

	public String login() throws Exception {
		System.out.println("login����");
		System.out.println(user.getUsername());
		UserService userService = new UserService();
		boolean success = userService.findUser(user);
		if (success) {
			return "success";
		} else {
			ServletActionContext.getRequest().setAttribute("error", "�û������������");
			return "error";
		}

	}
	
	public String register() throws Exception {
		System.err.println("register����");
		return null;
		
	}
	
	public String kill() throws Exception {
		System.err.println("kill����");
		return null;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
