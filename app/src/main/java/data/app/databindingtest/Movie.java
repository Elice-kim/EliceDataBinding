package data.app.databindingtest;

/**
 * Created by elice.kim on 2017. 12. 3..
 */

public class Movie {

    private String title, genre, year;
    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void setTitle(String name) {
        this.title = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
