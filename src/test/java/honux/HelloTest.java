package honux;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class HelloTest {

    @Test
    void test() {
        final int x = 3;
        assertThat(x).isGreaterThan(0);
    }
}
