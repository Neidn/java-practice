package Ans200116;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class p59 {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			ilist.add(i); // 리스트에 저장
		}
		// 초기값은 0
		s = ilist.stream().reduce(0, Integer::sum);
		// 초기값 0으로 지정하고 배열속의 값을 계속 누적해 더해가며 그걸
		// 정수형 값 sum으로 반환해주고 이걸 s에 저장한다
		System.out.println("1~100의 합: " + s);

		s = 0;
		s = ilist.stream().filter(i -> i % 2 == 1).reduce(0, Integer::sum);
		// 리스트에 있는 값 중 홀수 값을 reduce로 초기값 0으로 하여 누적시켜준다
		// 이를 정수형 sum으로 반환해주고 s에 저장한다
		System.out.println("1~100의 홀수의 합: " + s);
		
		s = ilist.stream().filter(i -> i % 2 == 1).reduce(0, (x, y) -> x + y);
		// 위와 똑같이 홀수를 반환해 reduce로 넘겨주나
		// 이 전에있는 값들을 더해주는 방식(x+y->x)식으로 바꿔 적용한다
		System.out.println("1~100의 합: " + s);

		s=ilist.stream().filter(i->i%2==1).reduce(0,
				new BinaryOperator<Integer>() {  //자바의 람다식 binary operator = 뒤의 두 값을 이용해 연산을하고 다시 리턴해준다
			@Override                            //새로운 클래스에 override해준다 
			public Integer apply(Integer t,Integer u) {//임시로 메소드를 만들고 이걸 binary에 오버라이드 해준다
				return t+u;
			}
		});    //즉, new~return까지가 하나의 누적 변수가 된다
		System.out.println("1~100의 합: " + s);
	}

}
