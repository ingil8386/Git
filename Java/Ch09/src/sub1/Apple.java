package sub1;

import java.io.Serializable;

public class Apple implements Serializable {
    private String color;
    private int price;
    private String country;

    public Apple(String country, int i) {
        this.country = country;
        this.price = i;
    }

    public void showInfo() {
        System.out.println(color + " 사과입니다.");
    }

    public void show() {
        System.out.println(country);
    }
}