package cn.tsyh.arrow.user.service.biz.impl;

import cn.tsyh.arrow.user.facade.service.UserServiceFacade;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author tsy
 * @Description
 * @date 15:09 2017/7/18
 */
@Service
@org.springframework.stereotype.Service("userServiceFacade")
public class UserServiceBizImpl implements UserServiceFacade {
    public void sayHello() {
        System.out.println("say hello");
    }
}
