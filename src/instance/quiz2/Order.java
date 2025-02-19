package instance.quiz2;

public class Order {
	
	int orderNumber; // 주문번호
	String orderDate; // 주문날짜
	String name; // 주문자이름
	String address; // 배송지
	
	// 리턴타입 함수의이름 (매개변수)
	// 
	// 사람의 정보만 출력하고 끝나는 메소드
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderNumber + ", 주문날짜: " + orderDate + ", 주문자이름: " + name + ", 배송지: " + address);
	}

}
