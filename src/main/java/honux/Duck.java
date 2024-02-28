package honux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck {

    private Wing wing;

    public Duck(@Autowired Wing wing) {
        this.wing = wing;
    }

    public void fly() {
        System.out.println("오리는" + wing.getShape() + " 갔습니다.");
    }
}
