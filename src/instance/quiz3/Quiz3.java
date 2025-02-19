package instance.quiz3;

public class Quiz3 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "자바프로그래밍";
		book1.price = 20000;
		book1.publisher = "한빛컴퍼니";
		book1.page = 300;
		
		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.publisher = "한빛컴퍼니";
		book2.page = 500;
		
		book1.showBookInfo();
		System.out.println(book1);
		book2.showBookInfo();
		System.out.println(book2);
		
	}

}
