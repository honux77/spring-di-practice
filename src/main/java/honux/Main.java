package honux;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml", Main.class);

        Duck duck = ctx.getBean("duck", Duck.class);
        Wing wing = ctx.getBean("wing", Wing.class);
        duck.setWing(wing);
        duck.fly();

    }
}