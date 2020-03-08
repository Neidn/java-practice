package Ans200304;

//15게임 만들기
// 정렬 가능여부 판단하기
public class p150 {
    //입력받은 2차원배열을 1차원 배열으로 바꾼다
    public void twoOne(int[][] puzzle, int[] sh) {
        int n = puzzle.length;
        int m = puzzle[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sh[i * n + j] = puzzle[i][j];
            }
        }
    }

    //입력받은 1차원배열을 2차원 배열으로 바꾼다
    public void oneTwo(int[][] puzzle, int[] sh) {
        int n = puzzle.length;
        int m = puzzle[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sh[i * n + j] = puzzle[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int num = 4;
        int[][] data = {{1, 2, 3, 4},
                {5, 6, 0, 7},
                {9, 10, 11, 8},
                {13, 14, 15, 12}};
        p150 puzzle = new p150(num);

    }

    private int[][] puzzle;
    private int n;


    //2차원 배열을 받는다
    public p150(int n) {
        init(n);
    }


    public p150() {
        this(4);
    }

    private void init(int n) {
        this.n = n;
        puzzle = new int[n][n];
        for (int i = 0; i < n * n; i++) {
            puzzle[i / n][i % n] = i;
        }
    }

    public int getPuzzle(int r, int c) {
        return puzzle[r][c];
    }


    //0~15사이의 랜덤수를 만든다
    private int num() {
        int row = puzzle.length;
        return (int) ((row * row) * Math.random());
    }

    //위에서 만든 순차적인 퍼즐을 섞는다
    public void shuffle() {
        int row = puzzle.length;
        int col = puzzle[0].length;
        int[] sh = new int[row * col];
        twoOne(puzzle, sh);
        //1차원 배열을 섞기
        for (int i = 0; i < sh.length; i++) {
            int temp = num();
            int mtemp = sh[i];
            sh[i] = sh[temp];
            sh[temp] = mtemp;
        }
        oneTwo(puzzle, sh);
    }

    private int invertnumber() {
        int row = puzzle.length;
        int col = puzzle[0].length;
        int[] sh = new int[row * col];
        twoOne(puzzle, sh);
        // 0의 위치를 찾는다
        int location = 0;
        for (int i = 0; i < sh.length; i++) {
            if (sh[i] == 0) {
                location = i;
                break;
            }
        }
        // 값이 뒤바뀐 경우의 수를 찾는다
        int ivn = 0;
        for (int i = 0; i < sh.length; i++) {
            for (int j = i + 1; j < sh.length; j++) {
                if (i != location && j != location && sh[i] > sh[j]) {
                    ivn++;
                }
            }
        }
        return ivn;
    }

}
