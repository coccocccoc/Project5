package method.quiz;

public class Quiz5 {

	// 나누기 함수를 만드시오
	// 단, 나누는 수(두번째 숫자)가 0이면
	// "나누는 수는 0이 될 수 없습니다"를 출력
	
	public static void method(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return;
			// return은 함수를 종료하는 기능이 있음
		}
		System.out.println(n1 / n2);

	}
	
	public static void main(String[] args) {
		method(10, 2);
		method(10, 0);
	}
	
	// 컴파일 오류 / 런타임 오류
	// 컴파일 오류: 문법적인 문제 (빨간색으로 표시), 작성하며 발견가능
	// 런타임 오류: 실행시에 계산 과정에서 오류, 실행후에 발견가능

}
