public class ThreeDArray {
    public static void main(String[] args) {

        int[][][] a = new int[2][2][2];

        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][1][0] = 3;
        a[0][1][1] = 4;

        a[1][0][0] = 5;
        a[1][0][1] = 6;
        a[1][1][0] = 7;
        a[1][1][1] = 8;

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1));

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}