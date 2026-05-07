package class1.sub2;

public class Product {
	
	public String productId;
	public String productName;
	public int price;
	public int quantity;
	
	
	public Product(String productId, String productName, int price , int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("현재 가격이 수정되었습니다.");
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("수량이 추가되었습니다");
	}
	
	public void printProductInfo() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
	}
}


