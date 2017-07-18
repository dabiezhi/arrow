package dubbo;

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
