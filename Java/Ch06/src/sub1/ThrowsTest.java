package sub1;

import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) {
		method1();
	}
	
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		Scanner scan  = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int num = scan.nextInt();// 숫자입력
		System.out.println("number : " + num);
		
	}
	
}
