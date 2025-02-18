package method;

// 함수(메소드)
public class Ex1 {

	// 1. 함수 정의
	// void: 반환값이 없다는 의미 (반환값이 있으면 int, String... 등)
	// (): 매개변수가 없다는 의미 (괄호 안이 비어있음)
	public static void method1() {
		System.out.println("매개변수와 리턴값이 없는 메소드입니다");
	}
	
	// String: 반환되는 값의 타입이 String (return 뒤의 값이 String)
	// (): 매개변수 없음 (괄호 안이 비어있음)
	public static String method2() {
		return "매개변수는 없고 리턴값은 있는 메소드입니다";
	}
	
	// void: 리턴값 없음
	// (int num): 매개변수 하나 있음
	public static void method3(int num) {
		System.out.println("num: " + num);
	}
	
	// int: 계산한 결과(숫자)를 반환
	// (): 정수타입의 매개변수 2개
	public static int method4(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		// 2. 함수 호출(사용)
		// 함수이름();
		
//		String result = method2(); // 함수의 return값을 변수에 담는 과정
//		System.out.println(result);
		
//		method3(10); // 함수를 호출할 때 숫자를 인자로 전달

//		int r = method4(3, 5);
//		System.out.println(r); // 8
		
	}

}
