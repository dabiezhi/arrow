package cn.tsyh.arrow.user.facade.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author tsy
 * @Description
 * @date 15:02 2017/7/18
 */
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface UserServiceFacade {
    public void sayHello();
}
