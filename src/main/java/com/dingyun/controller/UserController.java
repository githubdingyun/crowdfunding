package com.dingyun.controller;

import com.dingyun.model.User;
import com.dingyun.model.UserExample;
import com.dingyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public String login(User user) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsEmailEqualTo(user.getUsEmail()).andUsPasswordEqualTo(user.getUsPassword());
        List<User> userList = userService.selectByExample(userExample);
        return userList.isEmpty() ? "false" : "success";
    }


}
