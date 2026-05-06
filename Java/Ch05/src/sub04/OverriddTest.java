package sub04;

class AAA {
    public void method1() {
        System.out.println("AAA1");
    }

    public void method7(int a) {
		// TODO Auto-generated method stub
    	System.out.println("AAA7");
	}

	public void method6(int a) {
		// TODO Auto-generated method stub
    	System.out.println("AAA6");
		
	}

	public void metho4(int a, int b) {
		// TODO Auto-generated method stub
    	System.out.println("AAA3");
		
	}

	public void method5(int a) {
		// TODO Auto-generated method stub
		System.out.println("AAA");
		
	}

	public void method2() {
        System.out.println("AAA2");
    }

    public void method3() {
        System.out.println("AAA3");
    }
}

// AAA를 상속받음
class BBB extends AAA {

    @Override
    public void method1() {
        System.out.println("BBB1");
    }

    @Override
    public void method2() {
        System.out.println("BBB2");
    }

    public void method3(int a) {
        System.out.println("BBB3");
    }
}

// AAA를 상속받음
class CCC extends AAA {

    @Override
    public void method1() {
        System.out.println("CCC1");
    }

    @Override
    public void method2() {
        System.out.println("CCC2");
    }

    public void method3(int a , int b) {
        System.out.println("CCC3");
    }
}

public class OverriddTest {
    public static void main(String[] args) {

        AAA a = new AAA();
        BBB b = new BBB();
        CCC c = new CCC();

        a.method1();
        a.method2();
        a.method3();

        System.out.println();

        b.method1();
        b.method2();
        b.method3();

        System.out.println();

        c.method1();
        c.method2();
        c.method3(1,2);
    }
}