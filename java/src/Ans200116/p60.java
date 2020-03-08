package Ans200116;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//stream과 map 이용
public class p60 {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// stream선언, filter로 홀수 넘겨주기
		// map으로 넘어온 수를 제곱하기
		// 제곱한 수를 리스트로 반환하기
		ilist = ilist.stream()
				.filter(i -> i % 2 == 1)
				.map(i -> i * i)
				.collect(Collectors.toList());
		ilist.forEach(i -> {
			System.out.printf(i + " ");
		});
		System.out.println();
		// 이제 reduce로 값을 축적시켜준다
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합 : " + s);
	}

}
