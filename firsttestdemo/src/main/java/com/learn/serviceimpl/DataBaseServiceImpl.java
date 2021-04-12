package com.learn.serviceimpl;

import com.learn.service.DataBaseService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:27
 * @Description:
 */

@Service
public class DataBaseServiceImpl implements DataBaseService {


    @Override
    @Async
    public void backUpDataBase() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("执行数据库备份》》》》");
    }
}
