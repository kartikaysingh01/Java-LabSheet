public class SparseMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {0, 0, 3},
            {0, 4, 0},
            {5, 0, 0}
        };

        System.out.println("Sparse Matrix:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Non-zero elements:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] != 0) {
                    System.out.println(
                        "Row: " + i +
                        ", Column: " + j +
                        ", Value: " + a[i][j]
                    );
                }
            }
        }
    }
}