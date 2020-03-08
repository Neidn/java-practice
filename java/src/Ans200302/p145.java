package Ans200302;

import java.util.Arrays;

//이중배열 복사
public class p145 {
    private static double[][] m;

    public static void main(String[] args) {
        double[][] m1 = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        p145 mtr1 = new p145(m1);
        double[][] m2 = {{-1, 2, -3}, {2, -3, 4}, {-3, 4, -5}};
        p145 mtr2 = new p145(m2);
        mtr1.print();
        mtr2.print();

        p145 mtr3 = mtr1.makeMatrix(); //깊은복사
        mtr3.print();

        System.out.println(mtr1.equals(mtr3)); // 내용은 동일하나 해시코드값이 다르다
    }

    public p145(int a, int b) {
        m = new double[a][b];
    }

    public p145() {
        this(3, 3);
    }

    public p145(double[][] m) {
        this.m = deepCopy(m);
    }

    public void clear() {
        int a = m.length;
        for (int i = 0; i < a; i++) {
            Arrays.fill(m[i], 0);
        }
    }

    private double[][] deepCopy(double[][] deep) {
        int m = deep.length;
        int n = deep[0].length;
        double[][] paste = new double[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(deep[i], 0, paste[i], 0, n);
        }
        return paste;
    }

    public double[][] getMatrix() {
        return deepCopy(m);
    }

    public p145 makeMatrix() {
        return new p145(m);
    }

    public void print() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%f\t", m[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
