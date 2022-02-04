package com.star.service;

import com.star.entity.Message;

import java.util.List;

/**
 * @Description: 留言业务层接口
 * @Date: Created in 11:23 2020/4/16
 * @Author: 转角的微笑
 * @QQ群: 530311074
 * @URL: https://转角的微笑.newstar.net.cn/
 */
public interface MessageService {

    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);

}