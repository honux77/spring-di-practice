package honux;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.*;

class HelloTest {

    private ApplicationContext ctx;

    @BeforeEach
    void setup() {
        ctx = new ClassPathXmlApplicationContext("config.xml");
    }

    @Test
    void getWing() {
        assertThat(ctx.getBean("wing")).isInstanceOf(Wing.class);
    }
}
