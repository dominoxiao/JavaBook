package com.icss.bk.dao;

import com.icss.bk.biz.IRole;
import com.icss.bk.entity.User;

public class UserDao {
	
	/**
	 * �û�ע��
	 * @param user
	 * @return
	 */
	public boolean regist(User user){		
		return true;
	}
	
	
	/**
	 * �û���¼
	 * @param uname  �û���
	 * @param pwd    ����
	 * @return       ���ص�¼�ɹ����û���Ϣ
	 */
	public User login(String uname,String pwd){
		User user = null;
		
		if(uname.equals("tom") && pwd.equals("abc")){
		    //��ʾtom��¼�ɹ�
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("������ƽ��ͨѧԺ");
			user.setRole(IRole.COMMON_USER);			
		}else if(uname.equals("admin") && pwd.equals("123")){
			//�����Ա��¼�ɹ�
			user = new User();
			user.setUname(uname);
			user.setPwd(pwd);
			user.setAddress("���������йش�");
			user.setRole(IRole.ADMIN);			
		}else{
			//��¼ʧ��
			
		}
		
		
		return user;
	}

}
