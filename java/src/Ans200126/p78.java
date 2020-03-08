package Ans200126;

public class p78 {

	public static void main(String[] args) {
		// 동적 배열
		String[] myNum = new String[] { "2016-08-17", "2016-09-17", "2016-03-17" };
		// 정적 배열
		String[] myNum2 = { "2016-08-17", "2016-09-17", "2016-03-17" };
		System.out.println(myNum2[0]);
		for (String s : myNum) {
			System.out.print(s + " ");
		}
		System.out.println();
		// 정적배열은 다시 초기화가 불가능하다
//		myNum2={"2016-08-17","2016-09-17","2016-03-17"};
		myNum = new String[] { "2016-08-17", "2016-09-17", "2016-03-17" };
		String[] tos = new String[myNum.length];
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
	}
}
