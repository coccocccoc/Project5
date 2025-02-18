package method.quiz;

public class Quiz6 {

	// 계산기 메소드를 만드시오
	// 두 수와 연산자(+ - * /)를 입력받아 결과를 출력
	// ex) 1 5 + => 1 + 5 = 6
	// 함수이름? 매개변수? 리턴값?

//	public static void calc(int n1, int n2, char oper) {
//		if(oper == '+') {
//			System.out.println(n1 + n2);
//		} else if(oper == '-') {
//			System.out.println(n1 - n2);
//		} else if(oper == '*') {
//			System.out.println(n1 * n2);
//		} else {
//			System.out.println(n1 / n2);
//		}
//	}

	// switch문 사용
	public static void calc(int n1, int n2, char oper) {
		switch (oper) {
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
		}
	}

	public static void main(String[] args) {
		calc(8, 2, '*');

	}

}
