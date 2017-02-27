package com.liu.service;  
  
import org.springframework.stereotype.Service;  
  
import com.liu.domain.User;  
  
/** 
 * 功能概要：UserService接口类 
 *  
 * @author lium 
 * @since  2015年9月28日  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  