package method.quiz;

public class Quiz1 {

	// 두 숫자를 입력받아 차를 구하는 함수를 정의하시오
	// 함수를 호출하여 8-3의 결과를 출력하세요
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	// 두 숫자를 입력받아 곱하고 결과를 출력하는 함수를 정의하시오
	// 10 * 5
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	// 두 숫자를 입력받아 나누기를 하고 결과를 출력하는 함수를 정의하시오
	// 10 / 2
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	// 리턴값 x
	// 결과를 함수 안에서 출력함
	// -> 굳이 메인함수로 결과를 반환할 필요 없음
	public static void method(int n1, int n2) {
		int result = n1 - n2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// 함수를 부르고 반환받은 값을 받아서 출력
		int result1 = minus(8,3);
		System.out.println(result1);
		
		method(8,3); // 함수를 호출하고 끝
		
		int result2 = multiply(10, 5);
		System.out.println(result2);
		
		int result3 = divide(10, 2);
		System.out.println(result3);

	}

}
