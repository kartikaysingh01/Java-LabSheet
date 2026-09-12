class StringReverse {

    static int totalReversals = 0;

    void reverseString(String text) {

        totalReversals++;

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        System.out.println("Original String = " + text);
        System.out.println("Reversed String = " + reverse);
        System.out.println("Total Reversals = " + totalReversals);
    }

    public static void main(String[] args) {

        StringReverse s = new StringReverse();

        s.reverseString("Java");
    }
}