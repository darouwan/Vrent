package systen;

import entity.Movie;

import java.util.ArrayList;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class MovieSystem {
    ArrayList<Movie> movies = new ArrayList<Movie>();

    void createMovie(String title, String year, String director, String rating, String genre, String format, double cost, int quantity) {
        Movie movie = new Movie(title, year, director, rating, genre);
        movie.addCopy(format, cost, "unrent", quantity);
        movies.add(movie);
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
}
