package onbir_nisan;

public class Movies {
    public static void main (String [] args ){
        DVDCollection movies = new DVDCollection();

        movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
        movies.addDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
        movies.addDVD();

        System.out.println(movies);

        movies.addDVD();

        System.out.println(movies);

    }
}
