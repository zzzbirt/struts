package com.gucci.web;

import com.opensymphony.xwork2.Action;

public class ImplAction implements Action {

	@Override
	public String execute() throws Exception {
		System.err.println("����ʵ����Action�ӿڵ�action");
		return null;
	}

}
