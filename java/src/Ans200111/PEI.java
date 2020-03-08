package Ans200111;

public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;

	PEI(int pie) {
		this.peiValue = pie; 
		//enum은 상수로 변환할 수 없기에 생성자(23,28,33 이거)와
		//get메소드를 새로 정의하여 이용한다, 재귀적으로 불러 int값을 get에 보내준다
	}

	public int getPei() {
		return peiValue;
		//여기서 바로 위 메소드에서 보내준 정수를 리턴한다
	}
}