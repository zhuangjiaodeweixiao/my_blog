package com.star.dao;

import com.star.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description: 用户持久层接口
 * @Author: 转角的微笑
 * @Date: Created in 11:11 2020/3/26
 * @QQ群: 530311074
 * @URL: https://转角的微笑.newstar.net.cn/
 */
@Mapper
@Repository
public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}