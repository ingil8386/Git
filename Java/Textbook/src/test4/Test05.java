package test4;

class Apple {
    private String country;
    private int price;

    public Apple(String country, int price) { //답
        this.country = country;
        this.price = price;
    }

    @Override  //답
    public String toString() {
        return "Apple [country=" + country + ", price=" + price + "]";
    }
}

class Banana {
    private String country;
    private int price;

    public Banana(String country, int price) { //답
        this.country = country;
        this.price = price;
    }

    @Override //답
    public String toString() {
        // 문제지 결과 화면에 맞춰 Apple로 출력되도록 작성
        return "Apple [country=" + country + ", price=" + price + "]";
    }
}

class Grape {
    private String country;
    private int price;

    public Grape(String country, int price) { //답
        this.country = country;
        this.price = price;
    }

    @Override
    public String toString() {
        // 문제지 결과 화면에 맞춰 Apple로 출력되도록 작성
        return "Apple [country=" + country + ", price=" + price + "]";
    }
}

public class Test05 {
    public static void main(String[] args) {
        Apple apple = new Apple("한국", 3000);
        Banana banana = new Banana("미국", 2000);
        Grape grape = new Grape("일본", 1000);

        showInfo(apple);
        showInfo(banana);
        showInfo(grape);
    }

    public static void showInfo(Object fruit) { //답
        if (fruit instanceof Apple) { //답
            Apple apple = (Apple) fruit; //답
            System.out.println(apple);
        } else if (fruit instanceof Banana) {
            Banana banana = (Banana) fruit;
            System.out.println(banana);
        } else if (fruit instanceof Grape) {
            Grape grape = (Grape) fruit;
            System.out.println(grape);
        }
    }
}
