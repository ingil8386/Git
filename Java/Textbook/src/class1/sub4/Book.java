package class1.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title; // 책제목
		this.author = author; // 저자
		this.isbn = isbn; // 도서번호
		this.isBorrowd = false; // 대출여부
	}
	
	
		
	public void borrowBook() {
		//도서가 대출되지 않은 상태라면 대출
		if(isBorrowd==false) {
			System.out.println("도서를 대출합니다");
			isBorrowd = true;
		}
		else 
		{
			System.out.println(title + "이미 대출됨");

		}
		
	}

	public void returnBook() {
		//도서가 대출된 상태라면 반납
		if(isBorrowd==true) {
			System.out.println("도서를 반납합니다");
			isBorrowd = false;
		}
	}

	public void getBookInfo() {
		//도서의 정보를 출력 (제목, 저자, ISBN, 대출 여부)
		System.out.println(title);
		System.out.println(author);
		System.out.println(isbn);
		System.out.println(isBorrowd);
	}

	public String getTitle() {
		//속성 title의 Getter
		  return title;
	}


}

