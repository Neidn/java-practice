package Ans200130;
// 객체 비교를 이용하기

public class p107 {

	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make();
		cc.print();
		System.out.println("---------------------");
		cc.shuffle();
		cc.print();
		System.out.println("------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("--------------------");
		cc.sort();
		cc.print();
		System.out.println("------------------");
		cc.rsort();
		cc.print();
	}

}
