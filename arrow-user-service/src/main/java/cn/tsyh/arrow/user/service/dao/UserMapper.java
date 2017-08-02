package cn.tsyh.arrow.user.service.dao;

import cn.tsyh.arrow.user.facade.entity.User.User;

import java.util.List;

/**
 * @author tsy
 * @Description
 * @date 17:06 2017/8/2
 */
public interface UserMapper {

    public List<User> getUser();
}
