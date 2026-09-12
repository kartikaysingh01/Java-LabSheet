class WordCounter {

    static String language = "English";

    void countWords(String text) {

        String sentence = text.trim();

        String[] words = sentence.split(" ");

        int count = words.length;

        System.out.println("Language = " + language);
        System.out.println("Sentence = " + text);
        System.out.println("Number of Words = " + count);
    }

    public static void main(String[] args) {

        WordCounter w = new WordCounter();

        w.countWords("Java is easy to learn");
    }
}