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

	public String execute() throws Exception {
		System.err.println("我已经运行");
		UserService userService = new UserService();
		boolean success = userService.findUser(user);
		if (success) {
			return "success";
		} else {
			ServletActionContext.getRequest().setAttribute("error", "用户名或密码错误");
			return "error";
		}

	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
