package cn.tsyh.arrow.web.controller;

import cn.tsyh.arrow.user.facade.service.UserServiceFacade;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tsy
 * @Description
 * @date 15:18 2017/7/18
 */
public class UserController {

    @Reference(interfaceClass = cn.tsyh.arrow.user.facade.service.UserServiceFacade.class,check = false)
    private UserServiceFacade userServiceFacade;

    public void sayHel(String[] args){
        userServiceFacade.sayHello();
    }
}
