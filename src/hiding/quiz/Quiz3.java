package hiding.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(1); // 정상적으로 수정 됨
		date.showInfo();
		date.setMonth(13); // 수정 안됨
		date.showInfo();
	}

}

class MyDate {
	private int month; // 월
	private int day; // 일
	
	public int getMonth() {
		return month;
	}
	// 1~12월이 들어오면 값 변경
	// 그 외의 값이 들어오면 "잘못된 월입니다" 메시지 출력
	public void setMonth(int mon) {
		if(mon >= 1 && mon <= 12) {
			month = mon;
		} else {
			System.out.println(mon + "은 잘못된 월입니다");
			return; // 함수 종료
		}
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int d) {
		if(month == 2) {
			if(d < 1 || d > 28) {
				System.out.println("2월에는 " + d + "일이 없습니다");
				return;
			}
		}
		day = d;
	}
	
	public void showInfo() {
		System.out.println(month + "월 " + day + "일");
	}
}