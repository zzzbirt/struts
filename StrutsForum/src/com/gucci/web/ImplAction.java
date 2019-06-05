package com.gucci.web;

import com.opensymphony.xwork2.Action;

public class ImplAction implements Action {

	@Override
	public String execute() throws Exception {
		System.err.println("这是实现了Action接口的action");
		return null;
	}

}
