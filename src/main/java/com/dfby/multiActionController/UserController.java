package com.dfby.multiActionController;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: SpringMVC
 * @Date: 2018/9/11 16:31
 * @Author: Mr.Zhang
 * @Description:
 */
public class UserController extends MultiActionController {
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        System.out.println("登陆成功");

        String message = "登陆成功";
        modelAndView.addObject("message",message);

        return modelAndView;
    }

    public ModelAndView regist(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        System.out.println("注册成功");

        String message = "注册成功";
        modelAndView.addObject("message",message);

        return modelAndView;
    }
}
