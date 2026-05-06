package sub04;

public class Car {
	
	
	protected String name;
	protected String color;
	protected int speed;
	protected int cc;
	
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	public void speedUp() {
		this.speed += speed;
	}
	
	public void speedDown() {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량명 : " + this.color);
		System.out.println("차량명 : " + this.speed);
	}
}
