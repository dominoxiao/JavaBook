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
		u.setAddress("������������");
		boolean bRet = biz.regist(u);
		if(bRet){
			System.out.println(u.getUname() + "ע��ɹ�");
		}else{
			System.out.println(u.getUname() + "ע��ʧ��");
		}
		
	}
	
	public static void loginTest(){
		UserBiz biz = new UserBiz();
		User u = biz.login("tom", "123");
        if(u == null){
        	System.out.println( "�û����������������������");
        }else{
        	System.out.println( u.getUname() +  "--�û���¼�ɹ�"); 
        }		
	}
	
	public void testAA(){
	
         System.out.println( u.getUname() +  "--����"); 
		}
	
	
	
	public static void main(String[] args){
		UserUI.registTest();
		System.out.println("�������н���");
	}
}
