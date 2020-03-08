package Ans200302;

// 역행렬 구하기
// 가우스소거법을 이용한다
// 행렬에 동일한 크기의 단위행렬을 우측에 붙인다
// 원래 행렬을 단위행렬로 바꾸면 처음 단위행렬 부분이 역행렬로 바뀐다
// det를 사용하지 않고 역행렬을 구하는 방법이다
public class p147 {
    public static p145 revMatrix(p145 a) {
        double[][] matricex = a.getMatrix(); //복사를 이용해 하나 만든다
        double[][] matrices = new double[matricex.length][matricex[0].length * 2];

        for (int i = 0; i < matricex.length; i++) {
            for (int j = 0; j < matricex[i].length; j++) {
                matrices[i][j] = matricex[i][j];   //일단 동일한 부분은 복사
            }
        }
        for (int i = 0; i < matricex.length; i++) {
            matrices[i][i + matricex.length] = 1.0; // 이후 단위행렬 부분에 대각선만 1.0을 대입한다
        }
        //여기까지가 행렬 만들기
        int row = matrices.length;
        int col = matrices[0].length;

        for (int k = 0; k < row; k++) { // 행
            double max = 0.0;
            int pivotRow = k;
            for (int j = 0; j < row; j++) { // 열
                double tempMax = Math.abs(matrices[j][k]);
                if (max < tempMax) { //열에서 가장 큰값을 찾는다
                    max = tempMax;
                    pivotRow = j;
                }
            }

            if (k != pivotRow) { //pivotRow(열에서 가장큰값)의 위치가 대각선이 아니면 대각선기준 반대편으로 이동한다
                for (int j = 0; j < col; j++) {
                    double temp = matrices[k][j];
                    matrices[k][j] = matrices[pivotRow][j];
                    matrices[pivotRow][j] = temp;
                }
            }

            double pivot = matrices[k][k]; //피벗값을 1로 만든다
            for (int j = k; j < col; j++) {
                matrices[k][j] /= pivot; // 1로 만들기
            }

            for (int i = 0; i < row; i++) {
                if (i != k) {
                    double delta = matrices[i][k];
                    for (int j = k; j < col; j++) {
                        matrices[i][j] -= delta * matrices[k][j];
                    }
                }
            }
        }
        double[][] results = new double[matricex.length][matricex.length];
        for (int i = 0; i < matricex.length; i++) {
            for (int j = 0; j < matricex[i].length; j++) {
                results[i][j] = matrices[i][j + matricex[i].length];
            }
        }
        return new p145(results);
    }
}
