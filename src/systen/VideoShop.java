package systen;

import entity.*;

import java.util.Date;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class VideoShop {
    private VideoShop theOne = new VideoShop();

    private VideoShop() {
    }

    public VideoShop getInstance() {
        return theOne;
    }

    public void createMovie(String title, int year, String director, String rating, String genre) {

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
