package honux;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("레드덕", new RedWing());
        Duck duck2 = new Duck("샐리", new YellowWing());
        duck.fly();
        duck2.fly();
    }
}