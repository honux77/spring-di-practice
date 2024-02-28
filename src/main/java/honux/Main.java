package honux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("config.xml");
        Duck duck = ac.getBean(Duck.class);
        duck.fly();
    }
}