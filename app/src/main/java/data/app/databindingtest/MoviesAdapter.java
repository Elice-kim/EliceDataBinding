package data.app.databindingtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import data.app.databindingtest.databinding.ItemMovieListBinding;

/**
 * Created by elice.kim on 2017. 12. 3..
 */

class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    MoviesAdapter() {
        this.moviesList = new ArrayList<>();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemMovieListBinding binding = ItemMovieListBinding.
                inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.bind(movie);
    }

    void setItem(List<Movie> movie) {
        if (movie == null) {
            return;
        }
        this.moviesList = movie;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ItemMovieListBinding binding;

        MyViewHolder(ItemMovieListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(Movie movie) {
            binding.setVariable(BR.movie, movie);
        }
    }
}
