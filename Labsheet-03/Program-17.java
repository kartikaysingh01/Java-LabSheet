public class Maximum3D {
    public static void main(String[] args) {

        int[][][] a = {
            {
                {10, 25},
                {5, 18}
            },
            {
                {30, 12},
                {7, 20}
            }
        };

        int max = a[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {

                    if (a[i][j][k] > max) {
                        max = a[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum element = " + max);
    }
}