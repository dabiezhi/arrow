package dubbo;

import cn.tsyh.arrow.user.facade.service.UserServiceFacade;
import cn.tsyh.arrow.user.service.dao.UserMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tsy
 * @Description
 * @date 15:29 2017/7/18
 */
public class ArrowProvider {

    private ArrowProvider() {

    }

    /**
     * @param args
     *            启动参数
     */
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "classpath:spring/spring-context.xml");
            context.start();
            System.out.println(new ObjectMapper().writeValueAsString(((UserServiceFacade )context.getBean(UserServiceFacade .class))
                    .sayHello()));;
            System.out.println();
        } catch(Exception e) {
            e.printStackTrace();
        }
        synchronized(ArrowProvider.class) {
            while(true) {
                try {
                    ArrowProvider.class.wait();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
