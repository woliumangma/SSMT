package com.liu.service;  
  
import javax.annotation.Resource;

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.liu.baseTest.SpringTestCase;  
import com.liu.domain.User;  
  
/** 
 * 功能概要：UserService单元测试 
 *  
 * @author lium 
 * @since  2017年2月24日  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Resource
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.debug("查找结果" + user);  
    }  
      
  
}  