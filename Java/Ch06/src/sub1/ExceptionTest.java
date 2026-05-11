package sub1;

public class ExceptionTest {
	public static void main(String[] args) {
		//실행예외(런타임 발생)
		// 예외 상황  - 어떤수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;

		try {
			int rs1 = num1 + num2; // 덧셈
			int rs2 = num1 - num2; // 뺄셈
			int rs3 = num1 * num2; // 곱셈
			int rs4 = num1 / num2; // 나눗셈 //예외발생
			int rs5 = num1 % num2; // 나머지

			System.out.println("덧셈: " + rs1);
			System.out.println("뺄셈: " + rs2);
			System.out.println("곱셈: " + rs3);
			System.out.println("나눗셈: " + rs4);
			System.out.println("나머지: " + rs5);
			// 예외 상황  - 배열의 인덱스를 잘못 참조할때
			// 예외 상황  - 객체를 생성하지 않고 메서드를 호출
			// 예외 상황  - 잘못된 캐스팅(형변환. 다운캐스팅)
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("예외발생" + e.getMessage());
			//예외발생  2 배열의 인덱스를 잘못 참조할때
		}
		
			int[] arr = {1,2,3,4,5};
			
			try { //에외가 발생할 코드를 작성하는 코드블록
				for(int i=0; i<=5; i++) {
					System.out.println("arr["+i+"] :" + arr[i] );
				}
			} catch (ArrayIndexOutOfBoundsException e) { // 예외가 발생했을때 처리하는 코드블록
				// TODO: handle exception
				System.out.println("예외발생 " + e.getMessage());
			}
		
			//예외발생  3 객체를 생성하지않고 메서드를 호출
			Animal animal = null ;
			try {
				animal.move();
				
			} catch (NullPointerException e) {
				// TODO: handle exception	
				System.out.println("예외발생 " + e.getMessage());
			}
			//
			//예외상황 잘못된 캐시틍 형변환 다운캐스팅
			Animal a1 = new Tiger();
			Animal a2 = new Egle();
			Animal a3 = new Shark();
			
			try {
				Tiger tiger = (Tiger) a1;
				Egle eagle = (Egle) a2;
				Shark shark = (Shark) a2;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("예외발생 : " + e.getMessage());
			}

			System.out.println("프로그램 정상종료");
		
		//일반예외(컴파일 타임 발생)
		
	}
}
