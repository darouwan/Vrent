package systen;

import entity.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class VideoShop {
    private static VideoShop theOne = new VideoShop();

    private MovieSystem movieSystem = new MovieSystem();

    private VideoShop() {
    }

    public static VideoShop getInstance() {
        return theOne;
    }

    public void createMovie(String title, String year, String director, String rating, String genre, String format, double cost, int quantity) {
        movieSystem.createMovie(title, year, director, rating, genre, format, cost, quantity);
    }

    public List<Movie> getAllMovies() {
        return movieSystem.getAllMovies();
    }

    public void removeCopy(String title, String format) {

    }

    public void makeRental(String movie, String format, String ContactNo) {
    }

    public void collectMovie(String title, String format, String memContactNo) {
    }

    public void displayMovieTitle() {
    }

    public void createMember(String ContactNo, String name, String add) {
    }

    public void upgradeMember(String ContactNo) {
    }

    public void cancelMember(String ContactNo) {
    }

    public void displayMember() {
    }

    public void createPayment(double amtPaid, Date datePaid, int Type) {
    }

    public Movie getMovie() {
        return null;
    }

    public Copy getCopy() {
        return null;
    }

    public Rental getRental() {
        return null;
    }

    public Privilege getPrivilege() {
        return null;
    }

    public Member getMember() {
        return null;
    }

    public Payment getPayment() {
        return null;
    }
}
