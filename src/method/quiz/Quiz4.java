package method.quiz;

public class Quiz4 {

	// 두 수의 차를 구하는 함수를 만드시오
	// 첫번째 숫자가 두번째 숫자보다 작으면 -999를 출력하게
	
	// return x
	public static void method1(int n1, int n2) {
		if(n1 < n2) {
			System.out.println("-999");
		} else {
			System.out.println(n1 - n2);
		}
	}
	
	// return o
	public static int method2(int n1, int n2) {
		// return값은 모든 경우에 반환되어야 한다
		// 하지만 아래 조건문은 조건을 만족하는 경우에만 반환되어
		// 모든 경우에 반환이 되지 않는다
		if(n1 < n2) {
			return -999;
			// 조건에 맞지 않으면 차를 구할 필요가 없음
		}
		int result = n1 - n2;
		return result;
	}
	// return의 의미
	// 결과값을 반환한다
	// 함수를 종료한다
	
	public static void main(String[] args) {
		// return x
		method1(5, 1);

		// return o 
		int r = method2(5, 1);
		System.out.println(r);
	}

}
