package Ans200116;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//foreach의 다른형태
public class p57 {

	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1, 6, 16, 22, 33);
		//list에 저장
		mmlists.forEach(m -> {
			System.out.printf(m + "\t");
		});
		//foreach로 배열 안의 m을 불러온 후 {}; 사이로 임시식을 저장해준다
		System.out.println();
		Consumer<Integer> consume = (Integer m) -> {
			System.out.printf(m + "\t");
		};
		mmlists.forEach(consume);
	}

}
