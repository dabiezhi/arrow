import cn.tsyh.arrow.user.facade.service.UserServiceFacade;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;

/**
 * @author tsy
 * @Description
 * @date 17:24 2017/7/18
 */
public class test {

    @Reference(interfaceClass = cn.tsyh.arrow.user.facade.service.UserServiceFacade.class,check = false)
    private UserServiceFacade userServiceFacade;

    @Test
    public void test(){
        System.out.println(userServiceFacade.hashCode());
        userServiceFacade.sayHello();
    }
}
