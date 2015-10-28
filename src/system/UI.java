package system;

import entity.*;
import util.TextUtil;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Junfeng on 2015/10/25.
 */
public class UI {
    VideoShop videoShop = VideoShop.getInstance();
    TextUtil textUtil = new TextUtil();
    public void start() {
        boolean continueit = true;
        textUtil.readFromFile();
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
                this.displayMovieReturn();
            } else if (option.equals("5")) {
                this.displaySeatchMovie();
            } else if (option.equals("0")) {

                textUtil.init();
                textUtil.movieToText();
                textUtil.memberToText();

                textUtil.close();
                continueit = false;
            }
        }


    }

    private void displayMovieReturn() {
        String next = "1";
        while (next.equals("1")) {

            System.out.print("Enter Member Number:");
            String memberNum = readInput();
            System.out.print("Enter movie title to return: ");
            String title = readInput();
            System.out.print("Enter movie format [VCD/DVD]: ");
            String format = readInput();
            System.out.print("Confirm? ");
            System.out.println("1. Yes     2. No, return to Main Menu");
            String option = readInput();
            if (option.equals("1")) {
                videoShop.collectMovie(title, format, memberNum);
            } else {
                return;
            }
            System.out.println("Any more movies to return?");
            System.out.println("1. Yes     2. No ");
            System.out.print("Enter option: ");
            next = readInput();

        }
        System.out.println("Fines incurred: $0.0 ");
        System.out.println("Saving Performed ");
        System.out.println("Hit Enter to return to Main Menu ");
        readEnter();
    }

    private void displaySeatchMovie() {
        System.out.println(">>Search Movie<< ");
        System.out.println("Search criteria");
        System.out.println("1. Title");
        System.out.println("2. Year ");
        System.out.println("3. Director ");
        System.out.println("4. Rating");
        System.out.println("5. Genre ");
        System.out.println("0. Main Menu");
        System.out.print("Enter option: ");
        String option = readInput();
        String meta = "";
        if (option.equals("1")) {
            meta = "title";
        } else if (option.equals("2")) {
            meta = "year";
        } else if (option.equals("3")) {
            meta = "director";
        } else if (option.equals("4")) {
            meta = "rating";
        } else if (option.equals("5")) {
            meta = "genre";
        } else if (option.equals("0")) {
            return;
        }
        System.out.print("Enter " + meta + "  to be searched: ");
        String keyword = readInput();

        Movie movie = videoShop.searchMovie(keyword, meta);
        System.out.println(movie);
    }

    public static String readInput() {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        return a;
    }

    public static void readEnter() {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

    }


    public static void main(String[] args) {
        readEnter();
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
            Movie movie = videoShop.createMovie(title, year, director, rating, genre, format, Double.parseDouble(cost), Integer.parseInt(quantity));
            for (Copy copy : movie.getCopies()) {
                System.out.println(copy);
            }

        } else if (option.equals("2")) {
            return;
        }

        System.out.println("Saving Performed");
        System.out.println("Movie(s) is added to store");
        System.out.println("Hit Enter to return to Main Menu");
        readEnter();

    }

    public void displayAllMovies() {
        List<Movie> movieList = videoShop.getAllMovies();
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("Hit Enter to return to Main Menu");
        readEnter();
    }

    public void displayMembershipRecord() {
        System.out.println(">>Membership Record<<");
        System.out.println("1. Register Member");
        System.out.println("2. Delete Member");
        System.out.println("3. Upgrade Member");
        System.out.println("4. View Member List");
        System.out.println("5. Query Member Details");
        System.out.println("0. Main Menu");

        System.out.println("Enter option: ");
        String option = readInput();
        if (option.equals("1")) {
            displayregisterMember();
        } else if (option.equals("2")) {
            displayDeleteMember();
        } else if (option.equals("3")) {
            displayUpgradeMembership();
        } else if (option.equals("4")) {
            dispplayMembershipRecord();
        } else if (option.equals("5")) {
            displayQueryMember();
        } else if (option.equals("0")) {
            return;
        }
    }

    public void displayregisterMember() {
        System.out.println(">>Register Member<<");
        System.out.println("Enter details of new member:");
        System.out.print("Name:");
        String name = readInput();
        System.out.print("Member Number:");
        String number = readInput();
        System.out.print("Address:");
        String address = readInput();
        System.out.println("Contact No:");
        String contactNO = readInput();
        System.out.println("Type (B/P):");
        String type = readInput();

        videoShop.createMember(contactNO, name, address, number, type);


        System.out.println(">> Displaying all members <<");

        List members = videoShop.getAllMembers();

        for (Object member : members) {
            if (member instanceof Basic) {
                System.out.println((Basic) member);
            } else if (member instanceof Premium) {
                System.out.println((Premium) member);
            }
        }

        System.out.println("Saving Performed");
        System.out.println("Hit Enter to return to Main Menu");
        readEnter();
    }

    public void displayDeleteMember() {
        System.out.println(">>Delete Member<<");
        System.out.println("Enter Member Number: ");

        String number = readInput();

        boolean result = videoShop.deleteMember(number);
        if (result) {
            System.out.println("Saving Performed");
            System.out.println("Member is deleted");
        } else {
            System.out.println("Member not found");
        }

        System.out.println("Hit Enter to return to Main Menu");

        readEnter();
    }

    public void displayUpgradeMembership() {
        System.out.println(">>Upgrade Member<<");
        System.out.println("Enter Member Number to upgrade :");
        System.out.println("Upgraded Member Details: ");

        String number = readInput();


        System.out.println("Upgraded Member Details: ");
        Premium premium = videoShop.upgradeMember(number);
        if (premium != null) {
            System.out.println(premium);
        }

        System.out.println("Saving Performed");
        System.out.println("Hit Enter to return to Main Menu");
        readEnter();
    }

    public void dispplayMembershipRecord() {
        System.out.println(">>View Member List<<");

        List members = videoShop.getAllMembers();

        for (Object member : members) {
            if (member instanceof Basic) {
                System.out.println((Basic) member);
            } else if (member instanceof Premium) {
                System.out.println((Premium) member);
            }
        }

        System.out.println("Hit Enter to return to Main Menu");
        readEnter();
    }

    public void displayQueryMember() {
        System.out.println(">>Query Member<<");
        System.out.print("Enter Member Number: ");
        String memberNum = readInput();

        Renting renting = videoShop.queryMember(memberNum);
        Copy copy = renting.getCopy();
        Movie movie = videoShop.queryMovieByCopy(copy);

        System.out.println("Movie Details:");
        System.out.println(movie);
        System.out.println("Copy Details: ");
        System.out.println(copy);

        System.out.println("Hit Enter to return to Main Menu");
        readEnter();

    }

    public void displayMovieRental() {
        System.out.println(">>Movie Rental<<");
        String option = "1";
        while (option.equals("1")) {
            System.out.print("Enter Member Number:");
            String memberNum = readInput();
            System.out.print("Enter Movie Title: ");
            String title = readInput();
            System.out.print("Enter Movie Format: ");
            String format = readInput();

            Copy rentingOn = videoShop.getSpecificCopy(title, format);
            if (rentingOn != null) {
                rentingOn.setStatus(Copy.RENT);
                videoShop.makeRental(rentingOn, memberNum);
            } else {

            }

            System.out.println("Saving Performed Continue to rent more movies? 1. Yes  2. No  ");
            option = readInput();
            if (option.equals("")) {
                return;
            }

        }

    }
}
