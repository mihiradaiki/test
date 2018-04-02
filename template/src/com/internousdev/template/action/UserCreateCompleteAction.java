package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.template.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute()throws SQLException{
		userCreateCompleteDAO.ceteUser(session.get("loginUserId").toString(),
				session.get("userName").toString());

		String result = SUCCESS;

		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}

}
