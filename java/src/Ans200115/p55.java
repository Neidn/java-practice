package Ans200115;

//var args 가변인자를 이용해 배열처럼 사용
public class p55 {
	public static void print(int... mm) {
		for (int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] mm = { 1, 6, 16, 22, 23, 33 };
		print(mm);
		int a = 1, b = 6, c = 16;
		print(a);
		print(a, b);
		print(a, b, c);
	}
//가변인자(varargs, ...)는 타입이 같을경우 
//한개 이상의 변수를 배열처럼 받아서 사용
//배열도 되고 여러 개의 단일 변수도 가능
}
