package instance.quiz2;

public class Quiz2 {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNumber = 1111;
		order.orderDate = "2025년 2월 19일";
		order.name = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		order.showOrderInfo();

	}

}
