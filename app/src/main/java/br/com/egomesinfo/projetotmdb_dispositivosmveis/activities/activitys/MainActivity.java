package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.activitys;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.adapters.MoviesAdapter;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.api.MovieDBApi;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.api.RetrofitClient;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.constants.Constants;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.listeners.RecyclerViewGenresClickListener;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.listeners.RecyclerViewMoviesClickListener;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Genre;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Movie;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.MoviesResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements Callback<MoviesResponse>, RecyclerViewMoviesClickListener, RecyclerViewGenresClickListener {

    private RecyclerView recyclerView;
    private final static String TAG = MainActivity.class.getSimpleName();
    private MovieDBApi movieDBApi;
    private Call<MoviesResponse> call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        movieDBApi = RetrofitClient.getClient().create(MovieDBApi.class);

        call = movieDBApi.getPopularMovies(Constants.MOVIEDB_API_KEY);
        call.enqueue(this);
    }



    @Override
    public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
        Log.i(TAG, String.valueOf(response.code()));
        if (response.code() == 200) {
            MoviesAdapter adapter = new MoviesAdapter(this, response.body().getMovieResults(), this);
            recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void onFailure(Call<MoviesResponse> call, Throwable t) {
        Log.e(TAG, t.getLocalizedMessage());
    }

    @Override
    public void recyclerViewMoviesListClicked(View v, Movie currentMovie) {
        Intent intent = new Intent(this, MovieDetailActivity.class);
        intent.putExtra(Constants.INTENT_MOVIE_DETAIL, currentMovie);
        startActivity(intent);
    }

    @Override
    public void recyclerViewGenresListClicked(View g, Genre currentGenre) {
        Intent intent = new Intent(this, GenreListActivity.class);
        intent.putExtra(Constants.INTENT_GENRE_LIST, currentGenre);
        startActivity(intent);
    }


}
