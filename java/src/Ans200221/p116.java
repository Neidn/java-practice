package Ans200221;

//4배수 마방진 만들기
public class p116 {
    private int[][] magic;
    private int n;

    public int[][] getMagic() {
        return magic;
    }

    public p116(int n) {
        magic = new int[n][n];
        this.n = n;
    }

    public p116() {
        this(4);
    }

    public void make() {
        makeA();
        makeR();
    }

    private void makeA() {
        for (int i = 0; i < n * n; i++) {
            magic[i / n][i % n] = i + 1;
        }
    }

    private void makeR() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= 0 && i < n) || (i >= n / 4 * 3 && i < n)) { //i가 맨 밑줄또는 맨 윗줄
                    if (j >= n / 4 && j < n / 4 * 3) {                //j는 중간쯤
                        magic[i][j] = n * n - (i * n + j);
                    } else {                                                        //i는 중간쯤
                        if ((j >= 0 && j < n / 4) || (j >= n / 4 * 3 && j < n)) {   //j는 양 사이드
                            magic[i][j] = n * n - (i * n + j);
                        }
                    }
                }
            }
        }
    }

}
