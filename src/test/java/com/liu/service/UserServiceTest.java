package com.liu.service;  
  
import javax.annotation.Resource;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.liu.baseTest.SpringTestCase;  
import com.liu.domain.User;  
  
/** 
 * ���ܸ�Ҫ��UserService��Ԫ���� 
 *  
 * @author lium 
 * @since  2017��2��24��  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Resource
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.debug("���ҽ��" + user);  
    }  
      
  
}  