package com.liu.dao;  
  
  
import com.liu.domain.User;  
  
/** 
 * ���ܸ�Ҫ��User��DAO�� 
 *  
 * @author lium 
 * @since 2017��2��24�� 
 */  
public interface UserDao {  
    /** 
     *  
     * @author lium 
     * @since 2017��2��24�� 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
    public User selectUserById1(Integer userId);  
  
}  