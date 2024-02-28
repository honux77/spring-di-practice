package honux;

public class Duck {
    private Wing wing;
    private String name;

    public Duck(Wing wing, String name) {
        this.wing = wing;
        this.name = name;
    }

    public void fly() {
        System.out.println(name + "은(는) " + wing.getShape() + " 갔습니다.");
    }
}
