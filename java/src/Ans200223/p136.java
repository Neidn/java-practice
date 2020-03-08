package Ans200223;

//RSA 암호화하기
//임의의 수 p,q를 정한다
// p*q보다 큰 수는 복호화 할수가 없다
// phiN을 (p-1)*(q-1)인 수로 정의한다
// 2보다 크고 phiN보다 작은 으면서 phiN과 서로소인 공개키 e를 정의
// d * e % phiN==1인 개인키 d를 찾는다
// 암호화 할 문자가 m이라면 m을 e제곱한 후 n으로 나눈 나머지를 구한다 pow(m,e)%n
// 복호화 끝
public class p136 {
    private static final int START = 200;
    private int p = 11;
    private int q = 7;
    private int n;
    private int phiN;
    private int e;
    private int d;

    public void makePQ() {
        p = (int) (Math.random() * START);
        q = (int) (Math.random() * START);
    }

}
