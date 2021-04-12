package com.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ideabank
 * @Date: 2021/04/12/9:16
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  String  userName;
    private  Integer age;
    private  String sex;

}
