/**
 * Created by Junfeng on 2015/10/24.
 */
public class Movie {
    String title;
    String year  ;
    String director  ;
    String rating  ;
    String genre  ;

    public Movie( String t  ,int yr  ,String dir  ,String r  ,String g  ){}
    public void checkAvailableCopy(){}

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
