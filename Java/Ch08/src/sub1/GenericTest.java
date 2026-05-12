package sub1;

public class GenericTest {
    public static void main(String[] args) {

        Apple apple = new Apple("한국");
        Banana banana = new Banana("일본");

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.setFruit(apple);

        FruitBox<Banana> bananaBox = new FruitBox<>();
        bananaBox.setFruit(banana);

        System.out.println(appleBox.getFruit());
        System.out.println(bananaBox.getFruit());
    }
}