package method.quiz;

public class Quiz2 {

	// 합을 구하는 함수를 만들고 출력
	// ex) 1, 3 => 1 + 2 + 3 = 6
	
	// 리턴값 x
	public static void method(int n1, int n2) {
		int sum = 0;
		for(int num = n1; num <= n2; num++) {
			sum = sum + num;
		}
		int result = sum;
		System.out.println(result);
	}
	
	// 리턴값 o
	// 더하기 함수에서는 함수가 끝나기 전에 결과를 리턴해야 함
	public static int hap(int n1, int n2) {
		int sum = 0;
		for(int num = n1; num <= n2; num++) {
			sum = sum + num;
		}
		return sum;
	}
	
	// 메인함수에서 결과를 출력
	// 더하기 함수에서 보낸 반환값을 받아서 출력
	public static void main(String[] args) {
		int result = hap(2,4);
		System.out.println(result);

	}

}
