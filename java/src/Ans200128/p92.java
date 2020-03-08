package Ans200128;

import Ans200125.RestDay;

//파싱 후 리스트에 저장하기
public class p92 {

	public static void main(String[] args) {
		RequestFromBillboardHot rfw = new RequestFromBillboardHot();
		String a = "https://www.billboard.com/charts/hot-100/";
		String rs = rfw.getTimeDate(a);
		System.out.println("이번 주 " + rs);
		rs = RestDay.goGo(rs, 1);
	}
	
}
