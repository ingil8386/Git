package class1.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	 
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;	 //   대출여부 false 초기화
	}
	 
	public void bookTicket() {
		if(isBooked == false) {
			System.out.println("티켓을 예약했습니다.");
			this.isBooked = true;
		}
		else {
			System.out.println("이미 예약된 티켓입니다.");
		}
	}
	 
	public void cancelBook() {
		if(isBooked == true) {
			System.out.println("예약된 티켓을 취소했습니다.");
			this.isBooked = false;
		}
		else {
			System.out.println("예약된 티켓이 없습니다.");
		}
	}
	 
	public void printTicketInfo() {
		System.out.println("영화 제목 : " + movieTitle);
		System.out.println("상영 시간 : " + screenTime);
		System.out.println("좌석 번호 : " + seatNumber);
		System.out.println("예약 여부 : " + (isBooked ? "yes" : "no"));
	}
}