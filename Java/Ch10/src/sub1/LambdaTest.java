package sub1;

public class LambdaTest {

	// 정수 2개를 받아서 int 반환
	@FunctionalInterface
	interface A {
		public int method(int a, int b);
	}
	
	// 실수 2개를 받아서 double 반환
	@FunctionalInterface
	interface B {
		public double method(double a, double b);
	}
	
	// 정수 2개를 비교해서 boolean 반환
	@FunctionalInterface
	interface C {
		public boolean method(int a, int b);
	}
	
	// 문자열을 받아서 출력만 함 → 반환값 없음
	@FunctionalInterface
	interface D {
		public void method(String name);
	}
	
	public static void main(String[] args) {
		
		// int 반환
		A a = (x, y) -> x + y;
		System.out.println("A 결과 : " + a.method(10, 20));
		
		
		// double 반환
		B b = (x, y) -> x / y;
		System.out.println("B 결과 : " + b.method(10.0, 4.0));
		
		
		// boolean 반환
		C c = (x, y) -> x > y;
		System.out.println("C 결과 : " + c.method(10, 5));
		
		
		// void 반환
		D d = name -> System.out.println(name + "님 안녕하세요.");
		d.method("홍길동");
		
	}
}