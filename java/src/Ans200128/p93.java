package Ans200128;

import Ans200125.RestDay;

//이번주 빌보드 차트를 파싱
//만들어 뒀던 클래스를 이용한다
public class p93 {
	public static void main(String[] args) {
		RequestFromBillboardHot rfw = new RequestFromBillboardHot();
		String a = "https://www.billboard.com/charts/hot-100/";
		String rs = rfw.getTimeDate(a);
		rs = RestDay.goGo(rs, -7);
		System.out.println(rs);
		rfw.getAllHtml(a + rs);
		String str = "<article class=\"chart-row";
		rfw.getBillboardData(str);
		rfw.printBillboard();
	}
}
