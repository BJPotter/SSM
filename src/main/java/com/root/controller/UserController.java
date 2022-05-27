package com.root.controller;

import com.root.entity.User;
import com.root.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 类
 * </p>
 *
 * @author liuzhi
 * @Since 2022/05/27  10:13
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public ModelAndView getUsername(String username){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.selectById(username);
        modelAndView.addObject("message",user.toString());
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
