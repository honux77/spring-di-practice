package honux;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pool {

     public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml", Pool.class);
        Duck duck = ctx.getBean("duck", Duck.class);
        duck.fly();

    }
}