public class SecondLargest {
    public static void main(String[] args) {

        int[] a = {10, 25, 8, 40, 30};

        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } 
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondLargest);
    }
}