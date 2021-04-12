package com.learn.serviceimpl;

import com.learn.pojo.User;
import com.learn.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:25
 * @Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    private  static List<User> list = new ArrayList<>();

    static {
        list.add(new User("张三",32,"1"));
        list.add(new User("王宇",43,"0"));
        list.add(new User("李四",65,"0"));
        list.add(new User("赵薇",24,"1"));
        list.add(new User("刘东升",77,"0"));
    }



    @Override
    public String getUserNameById(String userId) {
        return list.get(Integer.valueOf(userId)).getUserName();
    }

    @Override
    public User getUserById(String userId) {
        return list.get(0);
    }
}
