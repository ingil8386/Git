package sub08;

public class SmartTV extends TV implements Internet, Computer{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		
		System.out.println("인터넷접속,");
		
	}

	@Override
	public void surf() {
		// TODO Auto-generated method stub
		 System.out.println("인터넷 탐색");
	}
	
	public void process() {
		System.out.println("SmartTv processing...");
	}

	public void save() {
		System.out.println("SmartTv saved...");
	}

	
	
	
}
