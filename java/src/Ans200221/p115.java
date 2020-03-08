package Ans200221;

//마방진 체크하는 클래스를 만든다
public class p115 {
    private int[][] magic;
    private int n;

    public void print() {
        System.out.println();
        System.out.println(n + "is magic : " + isMagic());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private boolean isMagic() {
        boolean isM = true;
        int[] m = new int[2 * n + 2]; // 행수n +열수n + 대각선+ 역대각선
        for (int i = 0; i < n; i++) {
            m[i] = sumRow(i);
            m[i + n] = sumCol(i);
        }
        m[2 * n] = sumDia();
        m[2 * n + 1] = sumReverseDia();

        for (int i = 1; i < m.length; i++) { // 한개라도 다르면 끝
            if (m[0] == 0 || m[0] != m[i]) {
                isM = false;
                break;
            }
        }
        return isM;
    }

    //열의 합
    private int sumRow(int row) {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[row][i];
        }
        return tot;
    }

    // 행의 합
    private int sumCol(int col) {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[i][col];
        }
        return tot;
    }

    //대각선의 합
    private int sumDia() {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[i][n - i - 1];
        }
        return tot;
    }

    private int sumReverseDia() {
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot += magic[n - 1 - i][i];
        }
        return tot;
    }

}
