package com.liu.service;  
  
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
  
import com.liu.dao.UserDao;  
import com.liu.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserServiceʵ���� 
 *  
 * @author lium 
 * @since  2015��9��28��  
 */  
@Service  
public class UserServiceImpl implements UserService{  
    @Resource  
    private UserDao userDao;

	@Override
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}  
  
  
  
}  
