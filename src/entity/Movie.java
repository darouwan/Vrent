package entity;

import systen.Serialize;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Junfeng on 2015/10/24.
 */
public class Movie implements Serialize {

    static int increasementID = 0;
    int id;
    String title;
    String year;
    String director;
    String rating;
    String genre;
    ArrayList<Copy> copies = new ArrayList<Copy>();

    public void addCopy(String format, double cost, String status, int quantity) {
        Copy copy = new Copy(format, status, cost);
        for (int i = 0; i < quantity; i++) {
            copies.add(copy);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String serialize() {

        return title + "|" + year + "|" + director + "|" + rating + "|" + genre;
    }

    public Movie(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, "|");
        title = tokenizer.nextToken();
        year = tokenizer.nextToken();
        director = tokenizer.nextToken();
        rating = tokenizer.nextToken();
        genre = tokenizer.nextToken();

    }

    public Movie(String title, String year, String director, String rating, String genre) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.genre = genre;
        this.id = increasementID++;

    }

    public void checkAvailableCopy() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
