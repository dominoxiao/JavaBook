package com.icss.bk.dao;

import com.icss.bk.biz.IRole;
import com.icss.bk.entity.User;

public class UserDao {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public boolean regist(User user){		
		return true;
	}
	
	
	/**
	 * 用户登录
	 * @param uname  用户名
	 * @param pwd    密码
	 * @return       返回登录成功的用户信息
	 */
	public User login(String uname,String pwd){
		User user = null;
		
		if(uname.equals("tom") && pwd.equals("abc")){
		    //表示tom登录成功
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("北京昌平交通学院");
			user.setRole(IRole.COMMON_USER);			
		}else if(uname.equals("admin") && pwd.equals("123")){
			//表管理员登录成功
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("北京海淀中关村");
			user.setRole(IRole.ADMIN);			
		}else{
			//登录失败
			
		}
		
		
		return user;
	}

}
