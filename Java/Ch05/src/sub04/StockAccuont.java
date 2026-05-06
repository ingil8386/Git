package sub04;

public class StockAccuont extends Account {

	private String company;
	private int amount;
	private int price;
	
	public StockAccuont(String bank, String name, int balance, String company, int amount, int price) {
		super(bank, name, balance);
		this.company = company;
		this.amount = amount;
		this.price = price;
	}

	
	public void buy(int amount , int price) {
		this.amount += amount;
		this.balance += amount*price;
		
		
	}
	public void sell() {
		this.amount += amount;
		this.balance += amount*price;
	}
	public void show() {
		
		
		System.out.println("은행명:"+ this.bank);
		System.out.println("아이디:"+ this.id);
		System.out.println("이름:"+ this.name);
		System.out.println("잔액:"+ this.bank);
		System.out.println("잔액:"+ this.balance);
		System.out.println("잔액:"+ this.amount);
		System.out.println("잔액:"+ this.price);
		
	}
	

}
