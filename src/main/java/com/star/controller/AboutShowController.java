package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 关于我界面显示控制器
 * @Date: Created in 11:03 2020/4/17
 * @Author: 转角的微笑
 * @QQ群: 530311074
 * @URL: https://转角的微笑.newstar.net.cn/
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}