package instance.quiz3;

public class Book {

	String title; // 제목
	int price; // 가격
	String publisher; // 출판사
	int page; // 페이지수
	
	public void showBookInfo() {
		System.out.println("제목: " + title + ", 가격: " + price + ", 출판사: " + publisher + ", 페이지수: " + page);
	}
	
}
