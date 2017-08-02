package cn.tsyh.arrow.user.service.biz.impl;

import cn.tsyh.arrow.user.facade.entity.User.User;
import cn.tsyh.arrow.user.facade.model.UserModel;
import cn.tsyh.arrow.user.facade.service.UserServiceFacade;
import cn.tsyh.arrow.user.service.dao.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author tsy
 * @Description
 * @date 15:09 2017/7/18
 */
@Service
@org.springframework.stereotype.Service("userServiceFacade")
public class UserServiceBizImpl implements UserServiceFacade {

    @Autowired
    private UserMapper userMapper;

    public UserModel sayHello() {
        List<User> users=userMapper.getUser();
        return new UserModel();
    }
}
