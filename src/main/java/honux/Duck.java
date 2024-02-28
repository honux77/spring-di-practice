package honux;

public class Duck {
    private Wing wing;
    private String name;

    public Duck(String name, Wing wing) {
        this.name = name;
        this.wing = wing;
    }

    public void fly() {
        System.out.println(name + "은(는) " + wing.getShape() + " 갔습니다.");
    }
}
