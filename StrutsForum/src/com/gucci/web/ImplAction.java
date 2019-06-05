package com.gucci.web;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ImplAction implements Action {

	@Override
	public String execute() throws Exception {
		System.err.println("这是实现了Action接口的action");
		return "defaultAction";
	}
	
	public String login() throws Exception {
		//得到原生的request域
		/*
		 * ServletActionContext.getRequest().setAttribute("username", "123");
		 * ServletActionContext.getRequest().setAttribute("password", "123");
		 */
		ActionContext.getContext().put("username", "123");
		ActionContext.getContext().put("password", "123");
		return "tologin";
	}

}
