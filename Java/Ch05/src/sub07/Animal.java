package sub07;

public abstract class Animal {	
	
	
	//추상 클래스 : 직접 객체를 생성할 수 없는 클래스 . 추상 메서드를 갖는 클래스	
	public void move() {
		String str = "";
		System.out.println("Animal move...");
	}
	
	
	// 추상메서드 :  자식의 클래스에서 재정의하는 메서드 . 문법적으로 반드시 구현하게 강제
	public abstract void hunt();
		//오버라이드를 위한 추상메서드
	
}
