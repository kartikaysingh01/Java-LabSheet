public class BoundaryElements {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Boundary elements:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (i == 0 || i == a.length - 1 ||
                    j == 0 || j == a[i].length - 1) {

                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}