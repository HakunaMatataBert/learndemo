package com.learn.controller;

import com.learn.pojo.User;
import com.learn.service.DataBaseService;
import com.learn.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:14
 * @Description:
 */

@RestController
public class LoginAction {

    @Autowired
    private LoginService loginService;

    @Autowired
    private DataBaseService dataBaseService;

    @RequestMapping("/login/{userId}")
    public String  userLogin(@PathVariable("userId") String userId) throws InterruptedException {
        dataBaseService.backUpDataBase();
        return  loginService.getUserNameById(userId);
    }


}
