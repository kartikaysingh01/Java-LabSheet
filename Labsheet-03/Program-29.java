public class SortJaggedArray {
    public static void main(String[] args) {

        int[][] a = {
            {30, 10, 20},
            {50, 20},
            {40, 10, 30, 20}
        };

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length - 1; j++) {

                for (int k = 0; k < a[i].length - 1 - j; k++) {

                    if (a[i][k] > a[i][k + 1]) {

                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted Jagged Array:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}