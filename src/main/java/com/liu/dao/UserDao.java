package com.liu.dao;  
  
  
import com.liu.domain.User;  
  
/** 
 * 功能概要：User的DAO类 
 *  
 * @author lium 
 * @since 2017年2月24日 
 */  
public interface UserDao {  
    /** 
     *  
     * @author lium 
     * @since 2017年2月24日 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
    public User selectUserById1(Integer userId);  
  
}  