package Ans200113;

// 논리 연산자 && || 사용
public class p41 {
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			isS = true; // year가 4의 배수이고 100의 배수가 아닐때이며 400또는 4의 배수이다
		}
		return isS;
	}

	public static void main(String[] args) {
		p41 hc = new p41();
		System.out.println(hc.isLeapYear(2017));
	}

}
