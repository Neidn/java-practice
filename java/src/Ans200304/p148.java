package Ans200304;

import java.util.Arrays;

public class p148 {
    boolean isShuffle = true;
    double[][] sdoku;
    double[][] basic;
    int n;

    public p148(int n) {
        this.n = n;
        sdoku = new double[n * n][n * n];
        basic = new double[n][n];
    }

    public p148() {
        this(3);
    }

    private void clean() {
        int m = sdoku.length;
        for (int i = 0; i < m; i++) {
            Arrays.fill(sdoku[i], 0);
        }
    }

    public boolean isShuffle() {
        return isShuffle;
    }

    public void setShuffle(boolean isShuffle) {
        this.isShuffle = isShuffle;
    }
}
