package method.quiz;

public class Quiz7 {

	// 세자리 정수의 각 자리수의 합을 구하는 함수
	// ex) 932 => 9 + 3 + 2 = 14
	public static void sum(int num) {
		System.out.println(num/100 + (num/10)%10 + num%10);
	}
	
	public static void main(String[] args) {
		
		sum(932);

	}

}
