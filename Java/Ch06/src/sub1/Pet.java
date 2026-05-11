package sub1;


public class Pet {
	public void makeSound() {
		System.out.println("Pet Sound!!");
	}
	
	
	public static void main(String[] args) {
		
		Pet cat = new Cat();
		Pet dog = new Dog();
		
		
	    PrintSound(dog);
	    PrintSound(cat);
	}

	
	public static void PrintSound(Pet p) {
		
		p.makeSound();
		
	
	}
}
