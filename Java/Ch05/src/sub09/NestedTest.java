package sub09;

// 외부클래스
class Outer {
    private int x;

    public Outer(int x) {
        this.x = x;
    }

    public void show() {
        System.out.println("Outer x: " + x);
    }

    // 내부클래스
    class inner {
        private int x;

        public inner(int x) {
            this.x = x;
        }

        public void show() {
            System.out.println("inner x: " + x);
        }
    }
}

public class NestedTest {
    public static void main(String[] args) {
        // 외부 객체 생성
        Outer out = new Outer(1);
        out.show();

        // 내부 객체 생성
        Outer.inner inn = out.new inner(2);
        inn.show();
    }
}