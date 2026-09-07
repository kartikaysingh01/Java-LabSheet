public class DiagonalSum {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            mainDiagonal = mainDiagonal + a[i][i];
            secondDiagonal = secondDiagonal + a[i][2 - i];
        }

        System.out.println("Main diagonal sum = " + mainDiagonal);
        System.out.println("Second diagonal sum = " + secondDiagonal);
    }
}