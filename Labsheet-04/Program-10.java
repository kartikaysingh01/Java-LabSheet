class Movie {

    String name;
    String genre;
    double rating;

    static String industry = "Bollywood";

    void display() {

        String movieName = "3 Idiots";
        String movieGenre = "Comedy";
        double movieRating = 8.4;

        name = movieName;
        genre = movieGenre;
        rating = movieRating;

        System.out.println("Movie Name = " + name);
        System.out.println("Genre = " + genre);
        System.out.println("Rating = " + rating);
        System.out.println("Industry = " + industry);
    }

    public static void main(String[] args) {

        Movie m = new Movie();

        m.display();
    }
}