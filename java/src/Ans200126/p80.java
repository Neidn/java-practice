package Ans200126;

import java.util.ArrayList;

//박싱과 언박싱(즉, 기본타입과 참조타입을 왔다갔다한다)
public class p80 {

	public static void main(String[] args) {
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		// new Integer(intNm1);
		Integer intWrap1 = intNm1;
		// new Long(longNum1);
		Long longWrap1 = longNum1;
		// new Double(doubleNum);
		Double doubleWrap1 = doubleNum;
		double dd = doubleWrap1;
		// 기본타입<-> 참조타입(wrapper)은 캐스팅이 필요없다
		Integer intWrap2 = intNm1;
		intNm1 = intWrap2;
		System.out.println(intNm1);

		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(new Integer(3));
		ilist.add(5);
		int a = ilist.get(0);
		System.out.println(a);

		int b = Integer.parseInt("1234");
		System.out.println(b);
	}
}
