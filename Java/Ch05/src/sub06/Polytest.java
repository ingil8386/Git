package sub06;

public class Polytest {
	public static void main(String[] args) {
//		Animal tiger = new Tiger();
//		Animal egle = new Egle();
//		Animal shark = new Shark();
		//참조변수의 타입을 부모 클래스로 선언 -- > 다형성 코드 표현 업캐스팅
		
		
		Animal a1 = new Tiger();
		Animal a2 = new Egle();
		Animal a3 = new Shark();
//		
//		tiger.move();
//		egle.move();
//		shark.move();
		
		a1.move();
		a2.move();
		a3.move();
		
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
//		tiger.hunt();
//		egle.hunt();
//		shark.hunt();
		//객체 타입확인 연산
		if(a1 instanceof Tiger) {
			System.out.println("a1 Tiger 객체 입니다.");
		}
		else if(a1 instanceof Egle) {
			System.out.println("a1은 egle객체입니다");
		}
		else if(a1 instanceof Shark) {
			System.out.println("a1 Shark 객체 입니다");
		}
		
		
		//다운캐스팅
		Tiger tiger = (Tiger) a1;
		Egle eagle =(Egle) a2;
		Shark shark = (Shark) a3;
		
		
		
		
	}
}
