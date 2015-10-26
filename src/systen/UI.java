package systen;

import entity.Movie;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class UI {
    VideoShop videoShop = VideoShop.getInstance();

    public void start() {
        boolean continueit = true;

        while (continueit) {
            displayMainMenu();
            String option = readInput();
            if (option.equals("1")) {
                //>Stock Control
                this.displayStockControl();

            } else if (option.equals("2")) {
                this.displayMembershipRecord();
            } else if (option.equals("3")) {
                this.displayMovieRental();
            } else if (option.equals("4")) {

            } else if (option.equals("5")) {

            } else if (option.equals("0")) {
                continueit = false;
            }
        }


    }

    public static String readInput() {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(readInput());
    }

    public void displayMainMenu() {
        System.out.println(">>Main Menu<<");
        System.out.println("1. Stock Control");
        System.out.println("2. Membership Record");
        System.out.println("3. Rental");
        System.out.println("4. Return Movie");
        System.out.println("5. Search Movie");
        System.out.println("0. Exit");
    }

    public void displayStockControl() {
        System.out.println(">>Stock Control<<");
        System.out.println("1. Add Movie");
        System.out.println("2. Display All Movies");
        System.out.println("0. Main Menu");

        String option = readInput();

        if (option.equals("1")) {
            displayAddMovie();
        } else if (option.equals("2")) {
            displayAllMovies();
        } else if (option.equals("0")) {
            return;
        }

    }

    public void displayAddMovie() {
        System.out.println(">>Add Movie<<");

        System.out.println("Title:");
        String title = readInput();
        System.out.println("Year:");
        String year = readInput();
        System.out.println("Director:");
        String director = readInput();
        System.out.println("Rating [G / PG / M / MA15 / R18]: ");
        String rating = readInput();
        System.out.println("Genre [a - Action/ b - Drama/ c - Comedy/ d - Musical/ e - Family/ f - Documentary]: ");
        String genre = readInput();
        System.out.println("Format [VCD/DVD]: ");
        String format = readInput();
        System.out.println("Cost:");
        String cost = readInput();
        System.out.println("Quantity: ");
        String quantity = readInput();

        System.out.println("Details of new Movie");


        System.out.println("Title:" + title);

        System.out.println("Year:" + year);

        System.out.println("Director:" + director);
        System.out.println("Rating [G / PG / M / MA15 / R18]: " + rating);
        System.out.println("Genre [a - Action/ b - Drama/ c - Comedy/ d - Musical/ e - Family/ f - Documentary]: " + genre);
        System.out.println("Format [VCD/DVD]: " + format);
        System.out.println("Cost:" + cost);
        System.out.println("Quantity: " + quantity);

        System.out.println("Confirm? 1. Yes     2. No, return to main menu ");


        System.out.print("Enter option: ");
        String option = readInput();

        if (option.equals("1")) {
            videoShop.createMovie(title, year, director, rating, genre, format, Double.parseDouble(cost), Integer.parseInt(quantity));

        } else if (option.equals("2")) {
            return;
        }

        System.out.println("Saving Performed");
        System.out.println("Movie(s) is added to store");
        System.out.println("Hit Enter to return to Main Menu");

    }

    public void displayAllMovies() {
        List<Movie> movieList = videoShop.getAllMovies();
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("Hit Enter to return to Main Menu");
        String option = readInput();
        return;
    }

    public void displayMembershipRecord() {
        System.out.println(">>Membership Record<<");
        System.out.println("1. Register Member");
        System.out.println("2. Delete Member");
        System.out.println("3. Upgrade Member");
        System.out.println("4. View Member List");
        System.out.println("5. Query Member Details");
        System.out.println("0. Main Menu");
    }

    public void displayregisterMember() {
        System.out.println(">>Register Member<<");
        System.out.println("Enter details of new member:");
        System.out.println("Name:");
        System.out.println("Member Number:");
        System.out.println("Address:");
        System.out.println("Contact No:");
        System.out.println("Type (B/P):");
        System.out.println(">> Displaying all members <<");
        System.out.println("Name:");
        System.out.println("Saving Performed");
        System.out.println("Hit Enter to return to Main Menu");
    }

    public void displayDeleteMember() {
        System.out.println(">>Delete Member<<");
        System.out.println("Enter Member Number: ");
        System.out.println("Saving Performed");
        System.out.println("Member is deleted");
        System.out.println("Hit Enter to return to Main Menu");


    }

    public void displayUpgradeMembership() {
        System.out.println(">>Upgrade Member<<");
        System.out.println("Enter Member Number to upgrade :");
        System.out.println("Upgraded Member Details: ");
        System.out.println("Saving Performed");
        System.out.println("Hit Enter to return to Main Menu");
    }

    public void dispplayMembershipRecord() {
        System.out.println(">>View Member List<<");
        System.out.println("Hit Enter to return to Main Menu");
    }

    public void displayQueryMember() {
        System.out.println(">>Query Member<<");
    }

    public void displayMovieRental() {
        System.out.println(">>Movie Rental<<");
    }
}
