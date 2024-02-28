package honux;


import org.springframework.stereotype.Component;

@Component
public class RedWing implements Wing {
    @Override
    public String getShape() {
        return "뒤뚱뒤둥";
    }
}
