package Ans200221;

//적금 구하기
public class p124 {
    public static double saveUs(int money, int month, double ratio) {
        double tot = 0.0;
        double r = ratio / 100 / 12;
        double a = money;
        for (int i = 0; i < month; i++) {
            a = a * (1 + r);
            tot += a;
        }
        return tot;
    }

    public static void main(String[] args) {
        System.out.print("적금 : " + saveUs(800000, 36, 1.5));
    }
}
