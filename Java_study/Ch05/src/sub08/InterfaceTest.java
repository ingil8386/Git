package sub08;

public class InterfaceTest {
	public static void main(String[] args) {
		
		//인터페이스 활용 : 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.powerOff();
		lg.chUP();
		lg.chDown();
		
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.powerOff();
		samsung.chUP();
		samsung.chDown();
		
		// 인터페이스 활용 : 모듈간 결합도 완화 ( 객체 유연성)
		Bulb bulb = new Bulb();
		Socket socket = new PowerCable(bulb);
		
		socket.switchOff();
		socket.switchOn();
		
		
		//인터페이스 활용 : 다중 상속 효과
		SmartTV stv = new SmartTV();
		
		stv.powerOn();
		stv.connection();
		stv.surf();
		stv.ChUp();
		stv.process();
		stv.save();
		
		
	}
}
