package com.learn.service;

import com.learn.pojo.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:23
 * @Description:
 */
public interface LoginService {

   String getUserNameById(String userId);


   User getUserById(String userId);

}
