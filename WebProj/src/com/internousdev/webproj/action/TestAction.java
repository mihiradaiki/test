package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;


public class TestAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 3248961266841519779L;
	private String username;
	private String password;
	public String execute(){
		return SUCCESS;
	}

	public String getUsername(){
		return username;
	}

	public void getUsername(String username){
		this.username=username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

}
