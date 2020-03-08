package Ans200110;

//실수 연산
//하이힐의 높이에 영향을 주는 요소들을 집어넣는다는데 그냥 무시하자
public class p22 {

	public static void main(String[] args) {
		double s = 6; //6 영국 신발사이즈 ->255mm
		double p = 0.75; //75%히트할 확률
		double l = 200; //200파운드 -> 1파운드 대략 1800원
		double t = 0; //0년 -올해유행, 1년 - 1년전 유행
		double a = 1; //음주량 0잔->8.83cm, 1잔->4.42cm
		double y = 2; //착용 년도
		double ups1 = p * l * (y + 9);
		double downs = (t + 1) * (a + 1) * (y + 10) * (l + 20);
		double ups2 = 12 + 3 * s / 8.0;
		double high = ups1 / downs * ups2;
		System.out.printf("적당한 높이는 %1$.2fcm", high);

	}

}
