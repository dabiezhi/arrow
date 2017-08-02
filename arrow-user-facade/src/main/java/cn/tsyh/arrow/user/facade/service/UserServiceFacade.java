package cn.tsyh.arrow.user.facade.service;

import cn.tsyh.arrow.user.facade.model.UserModel;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author tsy
 * @Description
 * @date 15:02 2017/7/18
 */
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface UserServiceFacade {
    public UserModel sayHello();
}
