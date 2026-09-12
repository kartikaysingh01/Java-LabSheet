class Matrix {

    static String matrixType = "2 x 2 Matrix";

    void calculateMatrices() {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] addition = new int[2][2];
        int[][] subtraction = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                addition[i][j] = a[i][j] + b[i][j];
                subtraction[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Matrix Type = " + matrixType);

        System.out.println("Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Matrix m = new Matrix();

        m.calculateMatrices();
    }
}