package com.icss.bk.biz;

import com.icss.bk.dao.UserDao;
import com.icss.bk.entity.User;

public class UserBiz {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public boolean regist(User user){
		boolean bRet = false;
		
		if(user != null){
			UserDao dao = new UserDao();
			bRet = dao.regist(user);
		}
		
		return bRet;
	}
	
	
	/**
	 * 用户登录
	 * @param uname  用户名
	 * @param pwd    密码
	 * @return       返回登录成功的用户信息
	 */
	public User login(String uname,String pwd){
		User user = null;
		
		if(uname != null && pwd != null && !uname.equals("") && !pwd.equals("") ){
			UserDao dao = new UserDao();
			user = dao.login(uname, pwd);			
		}

		对对对对对对多多多多多多多多
			啛啛喳喳错错错错错错错错错
		
		return user;
	}


}
