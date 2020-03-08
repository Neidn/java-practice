package Ans200302;

//두 행렬 합하기
public class p146 {
    public static void main(String[] args) {
        double[][] basic = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        p145 s0 = new p145(basic);
        s0.print();
        double[][] x2 = {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        double[][] x1 = {{0, 0, 1}, {1, 0, 0}, {0, 1, 0}};

        p145 mx1 = new p145(x1);
        p145 mx2 = new p145(x2);

        p145 s1 = p146.mulMatrix(mx2, s0);
        s1.print();
        p145 s2 = p146.mulMatrix(mx1, s0);
        s2.print();
        p145 s3 = p146.mulMatrix(s0, mx1);
        s3.print();
    }

    //행렬의 합
    public static p145 addMatrix(p145 a, p145 b) {
        int m = a.getMatrix().length;
        int n = a.getMatrix()[0].length;
        double[][] c = new double[m][n];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a.getMatrix()[i][j] + b.getMatrix()[i][j];
            }
        }
        return new p145(c);
    }

    //행렬의 곱
    //3x4 와 4x3의 행렬곱 결과는 3x3이 나온다
    public static p145 mulMatrix(p145 a, p145 b) {
        int m = a.getMatrix().length;
        int n = a.getMatrix()[0].length;
        int p = b.getMatrix()[0].length;
        double[][] c = new double[m][p]; //행렬곱의 결과 크기
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a.getMatrix()[i][k] * b.getMatrix()[k][j];
                }
            }
        }
        return new p145(c);
    }

}
