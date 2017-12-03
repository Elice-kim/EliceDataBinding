package data.app.databindingtest;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by elice.kim on 2017. 12. 3..
 */

public class Movie extends BaseObservable{

    private String title, genre, year;
    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    @Bindable
    public String getYear() {
        return year;
    }
    @Bindable
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
