package honux;

import org.springframework.beans.factory.annotation.Autowired;

public class Duck {


    @Autowired
    private Wing wing;

    public Duck(Wing wing) {
        this.wing = wing;
    }

    public void fly() {
        wing.print();
    }
}
