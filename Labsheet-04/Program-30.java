class Library {

    int booksAvailable;

    static String libraryName = "COER Library";

    void issueBook() {

        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {

        booksAvailable++;
        System.out.println("Book returned successfully.");
    }

    void displayBooks() {

        System.out.println("Library Name = " + libraryName);
        System.out.println("Books Available = " + booksAvailable);
    }

    public static void main(String[] args) {

        Library l = new Library();

        l.booksAvailable = 5;

        l.displayBooks();

        l.issueBook();

        l.displayBooks();

        l.returnBook();

        l.displayBooks();
    }
}