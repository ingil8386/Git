package sub1;

public class ThreadTest {
    public static void main(String[] args) {

        ChildThread ct = new ChildThread();

        ct.start(); // 스레드 실행
    }
}