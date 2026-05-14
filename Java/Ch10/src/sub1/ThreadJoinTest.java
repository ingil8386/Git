package sub1;

public class ThreadJoinTest {
	public static void main(String[] args) {
			ChildThread ct = new ChildThread();
			ct.setName("Child");
			
			ct.start();
			try {
				ct.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
			System.out.println("종료");
	}
}
