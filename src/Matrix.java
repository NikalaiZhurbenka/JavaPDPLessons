import java.util.Random;

public class Matrix {
    double[][] matrix;
    int rowsQ;
    int columnsQ;

    //matrix constructor
    public Matrix(int rowsQ, int columnsQ) {
        matrix = new double[rowsQ][columnsQ];
        this.rowsQ = rowsQ;
        this.columnsQ = columnsQ;
        fillMatrix();
    }

    //default filling matrix method
    public void fillMatrix() {
        for (int i = 0; i < rowsQ; i++) {
            for (int n = 0; n < columnsQ; n++) {
                matrix[i][n] = (int) (Math.random() * ((4) + 1));

//                System.out.println(matrix[i][n]);
            }
        }
    }

    public static void outputMatrix(Matrix m) {

        for (int i = 0; i < m.rowsQ; i++) {
            for (int j = 0; j < m.columnsQ; j++) {
                System.out.print(m.matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
    }

    // summ matrix
    public Matrix summMatrix(Matrix matrixForSumm) {
        if ((this.rowsQ == matrixForSumm.rowsQ) && (this.columnsQ == matrixForSumm.columnsQ)) {
            Matrix matrix2 = new Matrix(rowsQ, columnsQ);
            for (int i = 0; i < rowsQ; i++) {
                for (int n = 0; n < columnsQ; n++) {
                    matrix2.matrix[i][n] = this.matrix[i][n] + matrixForSumm.matrix[i][n];
                }
            }
            return matrix2;
        } else {
            System.out.println("Matrix can't be summed");
            return this;

        }
    }

    //multipy matrix by int
    public Matrix multiplyMatrix(int matrixMulti) {
        Matrix matrix3 = new Matrix(rowsQ, columnsQ);
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < columnsQ; j++) {
                matrix3.matrix[i][j] = this.matrix[i][j] * matrixMulti;
            }

        }
        return matrix3;
    }

    //multiply matrix by matrix
    public Matrix multiplyMatrixByMatrix(Matrix matrixForMulti) {
        if (this.columnsQ == matrixForMulti.rowsQ) {
            Matrix matrix4 = new Matrix(rowsQ, matrixForMulti.columnsQ);
            for (int i = 0; i < rowsQ; i++) {
                for (int j = 0; j < matrix4.columnsQ; j++)
                    matrix4.matrix[i][j] = 0;
            }

            for (int i = 0; i < rowsQ; i++) {
                for (int j = 0; j < matrix4.columnsQ; j++) {
                    for (int k = 0; k < columnsQ; k++) {
                        matrix4.matrix[i][j] += this.matrix[i][k] * matrixForMulti.matrix[k][j];
                    }
                }

            }
            return matrix4;
        } else {
            System.out.println("Matrix cant be multiplied");
            return this;
        }
    }
}
