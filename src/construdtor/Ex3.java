package construdtor;

public class Ex3 {

}

 // 게시물 클래스
class Board {
	int no;
	String title;
	String content;
	
	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
	}

	// 생성자 자동으로 만들기
	// 1. 클래스 내부를 클릭하고 우클릭
	// 2. source => Generate Constructor using Fields
	// 3. 필요한 멤버변수 체크 후 Generate
	// 기본 생성자는 체크를 모두 해제하면 됨
	
}