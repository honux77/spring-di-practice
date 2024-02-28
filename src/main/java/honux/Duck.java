package honux;

public class Duck {
    private Wing wing;
    private String name;

    public void fly() {
        System.out.println(name + "은(는) " + wing.getShape() + " 갔습니다.");
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public void setName(String name) {
        this.name = name;
    }
}
