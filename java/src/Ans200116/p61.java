package Ans200116;

//string char 이용
// 10진수를 2진수로 변환하기
public class p61 {
	public static final int BITMASK = 1;

	public static void main(String[] args) {
		int ival=2345;
		int eval=-2345;
		p61 bitsh=new p61();
		String vals=bitsh.makeBit(ival);
		
		System.out.println(vals);
		vals=bitsh.makeBit(eval);
		System.out.println(vals);
		
		char[] vs=vals.toCharArray();
		System.out.println(vs[0]);
	}

	private String makeBit(int value) {
		char[] val = new char[32];
		for (int i = 31; i >= 0; i--) {
			if ((value & BITMASK) == 1) {
				val[i] = '1';
			} else {
				val[i] = '0';
			}
			value >>>= 1;  //부호 무시하고 1비트 옮긴다
		}
		return new String(val); // val은 char 이므로 string으로 리턴해준다
	}

}
