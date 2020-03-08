package Ans200113;

//Math 클래스의 random을 사용해 임의의 세 정수를 만든다
public class p46 {

	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while (true) {
			a = (int) (range * Math.random() + start);
			b = (int) (range * Math.random() + start);
			c = (int) (range * Math.random() + start);
			if (a != b && b != c && c != a)
				break;
		}
		System.out.printf("%d\t%d\t%d", a, b, c);
	}

}
