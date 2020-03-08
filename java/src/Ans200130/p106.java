package Ans200130;

public class p106 {
	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make();
		cc.print();
		System.out.println("---------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("---------------------------");
		cc.shuffle();
		cc.print();
	}

}
