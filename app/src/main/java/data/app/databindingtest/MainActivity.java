package data.app.databindingtest;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import data.app.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ObservableArrayList<Movie> movieList;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mAdapter = new MoviesAdapter();
        movieList = new ObservableArrayList<>();
        binding.recyclerView.setAdapter(mAdapter);
        binding.setMovieList(movieList);

        prepareMovieData();
    }

    private void prepareMovieData() {
        movieList.add(new Movie("Mad Max: Fury Road", "Action & Adventure", "2015"));
        movieList.add(new Movie("Inside Out", "Animation, Kids & Family", "2015"));
        movieList.add(new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015"));
        movieList.add(new Movie("Shaun the Sheep", "Animation", "2015"));
    }
}
