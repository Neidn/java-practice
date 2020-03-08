package Ans200111;

public class p33 {
	public static void main(String[] args) {
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625; // 써울
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625; // 쓰까국 붓싼

		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longitude);
		// 인스턴스 새로 선언
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		// 객체 전달(인스턴스 끼리 복사해서 그대로 붙여넣을수 있다)
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);
	}
}
