package com.liu.service;  
  
import org.springframework.stereotype.Service;  
  
import com.liu.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserService�ӿ��� 
 *  
 * @author lium 
 * @since  2015��9��28��  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  