package class1.sub4;



public class Member {

	private String name; //회원 이름
	private String memberId; //회원 아이디
	private Book borrowedBook;//회원이 대출한 도서

	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book book) {
		//도서를 대출하고, 회원이 갖는 대출 도서에서 추가
		
        // 도서를 대출하고, 회원이 갖는 대출 도서에 추가
        if (borrowedBook == null) {
            book.borrowBook();
            borrowedBook = book;
        } else {
            System.out.println("이미 대출한 도서가 있습니다.");
        }
        
	}
	
	public void returnBook(Book book) {
		
	       // 도서를 반납하고, 회원이 갖는 대출 도서에서 제거
        if (borrowedBook == book) {
            book.returnBook();
            borrowedBook = null;
        } else {
            System.out.println("해당 도서를 대출하지 않았습니다.");
        }
        
		//도서를 반납하고, 회원이 갖는 대출 도서에서 제거
		
	}
	
	public void getMemberInfo() {
		  // 회원의 정보를 출력
        System.out.println("이름: " + name);
        System.out.println("회원 ID: " + memberId);

        if (borrowedBook == null) {
            System.out.println("대출한 도서: 없음");
        } else {
            System.out.println("대출한 도서: " + borrowedBook.getTitle());
        }
	}
	
}
