package com.learn.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:51
 * @Description:
 */
@Configuration
public class DataBaseTools {

    @Scheduled(cron = "0/5 * * * * ?")
    public void  executeTask(){
        System.out.println("执行任务.......");
    }


}
