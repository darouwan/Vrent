package systen;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class UI {
    public void start() {

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
    }

    public void displayAddMovie() {
        System.out.println(">>Add Movie<<");
        System.out.println("Title:");
        System.out.println("Year:");
        System.out.println("Director:");
        System.out.println("Rating [G / PG / M / MA15 / R18]: ");
        System.out.println("Genre [a - Action/ b - Drama/ c - Comedy/ d - Musical/ e - Family/ f - Documentary]: ");
        System.out.println("Format [VCD/DVD]: ");
        System.out.println("Cost:");
        System.out.println("Quantity: ");

        System.out.println("Details of new Movie");

        System.out.println(">>Add Movie<<");
        System.out.println("Title:");
        System.out.println("Year:");
        System.out.println("Director:");
        System.out.println("Rating [G / PG / M / MA15 / R18]: ");
        System.out.println("Genre [a - Action/ b - Drama/ c - Comedy/ d - Musical/ e - Family/ f - Documentary]: ");
        System.out.println("Format [VCD/DVD]: ");
        System.out.println("Cost:");
        System.out.println("Quantity: ");

        System.out.println("Saving Performed");
        System.out.println("Movie(s) is added to store");
        System.out.println("Hit Enter to return to Main Menu");

    }

    public void displayAllMovies() {
        System.out.println("Hit Enter to return to Main Menu");
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
