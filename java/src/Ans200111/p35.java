package Ans200111;
//34번이랑 동일
//삼항연산자, if랑 다를게 없다 E~~~~~~Z	
public class p35 {

	public static void main(String[] args) {
		int temp = 99;
		temp = (temp % 2 == 1) ? temp * 3 + 1 : temp / 2;
		System.out.println("계산 후=" + temp);
	}

}
