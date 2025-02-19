package reference.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		Book book1 = new Book(null, 0, null, 0);
		Book book2 = new Book(null, 0, null, 0);
		Book book3 = new Book(null, 0, null, 0);

		Member member = new Member(0, null, book1, book2, book3);

	}

}

// 책
class Book {
	String title; // 제목
	int price; // 가격
	String publisher; // 출판사
	int page; // 페이지수

	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}

}

// 회원
class Member {
	int memberNo; // 회원번호
	String name; // 이름
	
	// 대여한 책 목록
	Book book1; // {"자바프로그래밍", 20000, "한빛출판사", 200}
	Book book2;
	Book book3;
//	String book1; // "자바프로그래밍"
//	String book2;
//	String book3;


	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}

}