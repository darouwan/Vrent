package system;

import entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class VideoShop {
    private static VideoShop theOne = new VideoShop();

    static public MovieSystem movieSystem = new MovieSystem();
    static public ArrayList members = new ArrayList();
    static public ArrayList<Renting> rentings = new ArrayList<Renting>();

    private VideoShop() {
    }


    public static VideoShop getInstance() {
        return theOne;
    }

    public Movie createMovie(String title, String year, String director, String rating, String genre, String format, double cost, int quantity) {
        return movieSystem.createMovie(title, year, director, rating, genre, format, cost, quantity);
    }

    public List<Movie> getAllMovies() {
        return movieSystem.getAllMovies();
    }

    public void removeCopy(String title, String format) {

    }

    public void makeRental(Copy copy, String memberNum) {
        Renting renting = new Renting();
        renting.setCopy(copy);
        renting.setMemberNum(memberNum);
        rentings.add(renting);
    }

    public void collectMovie(String title, String format, String memberNum) {
        for (int i = 0; i < rentings.size(); i++) {
            Renting renting = rentings.get(i);
            if (renting.getMemberNum().equals(memberNum)) {
                Copy copy = renting.getCopy();
                Movie movie = movieSystem.getMovieByCopy(copy.getId());
                if (movie.getTitle().equals(title) && copy.getFormat().equals(format)) {
                    rentings.remove(i);
                }
            }
        }
    }

    public void displayMovieTitle() {
    }

    public void createMember(String ContactNo, String name, String add, String number, String type) {
        if (type.equals("B")) {
            Basic basic = new Basic(ContactNo, name, add, number, 0, 0, 0, 0, 0);
            members.add(basic);
        } else {
            Premium premium = new Premium(ContactNo, name, add, number, 0, 0, 0, 0, 0);
            members.add(premium);
        }
    }

    public List getAllMembers() {
        return members;
    }

    public boolean deleteMember(String number) {

        for (int i = 0; i < members.size(); i++) {
            Member member = (Member) members.get(i);
            if (member instanceof Basic) {
                if (number.equals(((Basic) member).getNumber())) {
                    members.remove(i);
                    return true;
                }
            } else if (member instanceof Premium) {
                if (number.equals(((Premium) member).getNumber())) {
                    members.remove(i);
                    return true;
                }
            }
        }

        return false;
    }

    public Premium upgradeMember(String number) {
        for (int i = 0; i < members.size(); i++) {
            Member member = (Member) members.get(i);
            if (member instanceof Basic) {
                if (number.equals(((Basic) member).getNumber())) {

                    Premium premium = new Premium(((Basic) member).getContactNo(), ((Basic) member).getName(), ((Basic) member).getAdd(),
                            ((Basic) member).getNumber(), 0, 0, 0, 0, 0);
                    members.set(i, premium);
                    return premium;
                }
            }
        }

        return null;
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


    public Copy getSpecificCopy(String title, String format) {
        Movie movie = movieSystem.getMovie(title);
        Copy onecopy = null;
        for (Copy copy : movie.getCopies()) {
            if (copy.getFormat().equals(format) && copy.getStatus().equals(Copy.UNRENT)) {
                onecopy = copy;

            }
        }
        return onecopy;
    }


    public Movie searchMovie(String keyword, String meta) {

        return movieSystem.search(keyword, meta);
    }

    public Renting queryMember(String memberNum) {
        for (Renting renting : rentings) {
            if (renting.getMemberNum().equals(memberNum)) {
                return renting;
            }
        }
        return null;
    }

    public Movie queryMovieByCopy(Copy copy) {

        return movieSystem.getMovieByCopy(copy.getId());
    }
}
