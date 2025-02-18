package method.quiz;

public class Quiz3 {

	// 두 수를 비교하는 함수를 만드시오
	// 둘 중 더 큰 숫자를 구하시오
	// ex) 10, 5 => 10
//	public static void method(int n1, int n2) {
//		int i = (n1 > n2) ? n1 : n2;
//		System.out.println(i);
//	}
//	
//	// return x
//	// 조건문 사용
//	public static void method1(int n1, int n2) {
//		if(n1 > n2) { // 앞의 숫자가 더 크면
//			System.out.println(n1); // 앞의 숫자 출력
//		} else {
//			System.out.println(n2); // 그렇지 않으면 뒤의 숫자를 출력
//		}
//	}
	
	public static int method2(int n1, int n2) {
		if(n1 > n2) { // 앞의 숫자가 더 크면
			return n1; // 앞의 숫자 출력
		} else {
			return n2; // 그렇지 않으면 뒤의 숫자를 출력
		}
	}
	
	public static void main(String[] args) {
		
//		method(100, 200);
		
		int result = method2(100,200);
		System.out.println(result);

	}

}
