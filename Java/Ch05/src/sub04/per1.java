package sub04;

class Person {
    String name;
    int age;

    // 생성자: 모든 인스턴스 변수 초기화
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드
    public void work() {
        System.out.println("person is working");
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "이고 나이 " + age + "세 입니다");
    }
}

class Doctor extends Person {
    String specialty;

    // 생성자: 부모 변수 + 자기 변수 초기화
    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    // work() 오버라이딩
    @Override
    public void work() {
        System.out.println("person is working");
    }

    // introduce() 오버라이딩
    @Override
    public void introduce() {
        System.out.println("제 이름은 " + name + "이고 나이 " + age + "세 입니다");
        System.out.println("저는 의사이며 전공은 " + specialty + " 입니다");
    }
}

class Engineer extends Person {
    String field;

    // 생성자: 부모 변수 + 자기 변수 초기화
    public Engineer(String name, int age, String field) {
        super(name, age);
        this.field = field;
    }

    // work() 오버라이딩
    @Override
    public void work() {
        System.out.println("제 이름은 " + name + "이고 나이 " + age + "세 입니다");
        System.out.println("저는 " + field + " 엔지니어입니다");
    }
}

public class per1 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", 30);
        Doctor d = new Doctor("김의사", 40, "내과");
        Engineer e = new Engineer("박엔지니어", 28, "소프트웨어");

        p.work();
        p.introduce();

        System.out.println();

        d.work();
        d.introduce();

        System.out.println();

        e.work();
    }
}