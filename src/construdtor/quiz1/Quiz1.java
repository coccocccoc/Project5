package construdtor.quiz1;

public class Quiz1 {

	public static void main(String[] args) {

		// 1. 디폴트 생성자를 사용하여 인스턴스 생성
		Book book1 = new Book();
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.publisher = "한빛출판사";
		book1.page = 300;
		
		// 2. 모든 멤버변수를 초기화하면서 인스턴스 생성
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
		
	}

}

class Book {

	String title; // 제목
	int price; // 가격
	String publisher; // 출판사
	int page; // 페이지수

	// 기본 생성자
	public Book() {

	}
	
	public Book(String title, int price, String publisher, int page) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.page = page;
	}
	
	// 클래스 내부에 생성자가 하나라도 있으면
	// 컴파일러는 기본생성자를 만들지 않는다
	
}
