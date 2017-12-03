package data.app.databindingtest;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;

/**
 * Created by elice.kim on 2017. 12. 3..
 */

public class AdapterBindings {

    @BindingAdapter("bind:item")
    public static void bindItem(RecyclerView recyclerView, ObservableArrayList<Movie> movie) {
        MoviesAdapter adapter = (MoviesAdapter) recyclerView.getAdapter();
        if (adapter != null) {
            adapter.setItem(movie);
        }
    }
}
