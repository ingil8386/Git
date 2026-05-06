package sub04;

public class Truck extends Car{

	private int capacity; //적재용량
	private final int  MAX_SPEED=160;
	
	public Truck(String name, String color, int speed) {
		super(name, color, speed);
		this.capacity =capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	@Override
	public void speedUp() {
		if(speed > MAX_SPEED ) {
			this.speed = MAX_SPEED;
		}
		
	}
	
	public void show() {
		System.out.println("차량명:ㅣ" + name);
		System.out.println("차량명:ㅣ" + color);
		System.out.println("차량명:ㅣ" + this.capacity);
		System.out.println("차량명:ㅣ" + speed);
	}
}
