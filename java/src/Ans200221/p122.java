package Ans200221;

public class p122 {
    private static void stepDia(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.abs(i - n / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - 2 * Math.abs(i - n / 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stepDia(9);
    }
}
