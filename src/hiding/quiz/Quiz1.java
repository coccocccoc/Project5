package hiding.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setPublisher("한빛컴퍼니");
		book1.setPage(300);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println(book1.getPublisher());
		System.out.println(book1.getPage());
		
		Book book2 = new Book();
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setPublisher("한빛컴퍼니");
		book2.setPage(500);
		System.out.println(book2.getTitle());
		System.out.println(book2.getPrice());
		System.out.println(book2.getPublisher());
		System.out.println(book2.getPage());

	}

}

class Book {
	// private 접근제어자: 클래스 내부에서만 사용 가능
	private String title;
	private int price;
	private String publisher;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}