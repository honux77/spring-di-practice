package honux;

public class Duck {

    private Wing wing;

    public Duck(){}

    public Duck(Wing wing) {
        this.wing = wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public void fly() {
        wing.print();
    }
}
