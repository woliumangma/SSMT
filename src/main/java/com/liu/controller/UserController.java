package com.liu.controller;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
import com.liu.domain.User;  
import com.liu.service.UserService;  
  
/** 
 * ���ܸ�Ҫ��UserController 
 *  
 * @author lium 
 * @since  2017��2��24��  
 */  
@Controller  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
}  
