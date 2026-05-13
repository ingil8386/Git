package sub1;

public class Apple {
    private String color;
    private int price;
    private String country;

    public Apple(String country) {
        this.country = country;
    }

    public void showInfo() {
        System.out.println(color + " 사과입니다.");
    }

    public void show() {
        System.out.println(country);
    }
}