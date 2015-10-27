package systen;

import entity.Copy;
import entity.Movie;

import java.util.ArrayList;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class MovieSystem {
    public ArrayList<Movie> movies = new ArrayList<Movie>();

    Movie createMovie(String title, String year, String director, String rating, String genre, String format, double cost, int quantity) {
        Movie movie = new Movie(title, year, director, rating, genre);
        movie.addCopy(format, cost, Copy.UNRENT, quantity);
        movies.add(movie);
        return movie;
    }

    public Movie search(String keyword, String meta) {
        for (Movie movie : movies) {
            if (meta.equals("title") && movie.getTitle().equals(keyword)) {
                return movie;
            } else if (meta.equals("year") && movie.getYear().equals(keyword)) {
                return movie;
            } else if (meta.equals("director") && movie.getDirector().equals(keyword)) {
                return movie;
            } else if (meta.equals("rating") && movie.getRating().equals(keyword)) {
                return movie;
            } else if (meta.equals("genre") && movie.getGenre().equals(keyword)) {
                return movie;
            }
        }
        return null;
    }

    public Movie getMovieByCopy(int copyID) {
        for (Movie movie : movies) {
            for (Copy copy : movie.getCopies()) {
                if (copy.getId() == copyID) {
                    return movie;
                }
            }
        }
        return null;
    }

    public ArrayList<Movie> getAllMovies() {
        return movies;
    }

    void makeRental(String movie,String format ,String ContactNo){

    }
    void collectMovie(String title ,String format ,String memContactNo){

    }
    void displayMovieTitle(){

    }
    void createMember(String ContactNo,String name,String add){

    }
    void upgradeMember(String ContactNo){

    }
    void cancelMember(String ContactNo){

    }
    void displayMember(){

    }

    public Movie getMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }


}
