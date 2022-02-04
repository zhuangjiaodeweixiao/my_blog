package com.star.service;

import com.star.entity.User;

/**
 * @Description: 用户业务层接口
 * @Author: 转角的微笑
 * @Date: Created in 10:59 2020/3/26
 * @QQ群: 530311074
 * @URL: https://转角的微笑.newstar.net.cn/
 */
public interface UserService {

//    核对用户名和密码
    User checkUser(String username, String password);

}