package sub08;


// 인터페이스 : 오직 추상메서드만 갖는 구조체
public interface RemoteControl {
	
	// 인터페이스는 속성을 갖지 않음
	
	 public abstract void powerOn();
	 public abstract void powerOff();
	 
	 public void chUP();
	 public void chDown();
	 
	 public void soundUp();
	 public void soundDown();
}
