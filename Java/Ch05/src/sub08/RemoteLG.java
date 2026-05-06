package sub08;


public class RemoteLG implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG - powerOn");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG - powerOff");
	}

	@Override
	public void chUP() {
		// TODO Auto-generated method stub
		System.out.println("LG - chUP");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("LG - chDown");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("LG - soundUp");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("LG - soundDown");
	}
	
}
