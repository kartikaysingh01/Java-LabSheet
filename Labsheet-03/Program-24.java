public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 20, 40};

        int[] result = new int[a.length];
        int size = 0;

        for (int i = 0; i < a.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < size; j++) {

                if (a[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[size] = a[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}