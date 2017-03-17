package com.icss.bk.ui;

import com.icss.bk.biz.IRole;
import com.icss.bk.biz.UserBiz;
import com.icss.bk.entity.User;

public class UserUI {
	
	public static void registTest(){
		UserBiz biz = new UserBiz();
		User u = new User();
		u.setUname("jack");
		u.setPwd("123");
		u.setRole(IRole.VIP_USER);
		u.setAddress("北京朝阳望京");
		boolean bRet = biz.regist(u);
		if(bRet){
			System.out.println(u.getUname() + "注册成功");
		}else{
			System.out.println(u.getUname() + "注册失败");
		}
		
	}
	
	public static void loginTest(){
		UserBiz biz = new UserBiz();
		User u = biz.login("tom", "123");
        if(u == null){
        	System.out.println( "用户名、密码错误，请重新输入");
        }else{
        	System.out.println( u.getUname() +  "--用户登录成功"); 
        }		
	}
	
	public void testAA(){
	
         System.out.println( u.getUname() +  "--测试"); 
		}
	
	
	
	public static void main(String[] args){
		UserUI.registTest();
		System.out.println("程序运行结束");
	}
}
