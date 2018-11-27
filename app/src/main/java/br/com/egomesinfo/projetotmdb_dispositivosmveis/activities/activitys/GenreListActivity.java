package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import java.util.ArrayList;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.adapters.MovieListAdapter;


public class GenreListActivity extends AppCompatActivity {

        RecyclerView mGenderListRecyclerView;
        ProgressBar mGenderListProgressBar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.genre_list);


            mGenderListRecyclerView = findViewById(R.id.recycler_view_generoFilmes);
            mGenderListProgressBar = findViewById(R.id.progress_movie_load);

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                    this,
                    LinearLayoutManager.VERTICAL,
                    false);

            MovieListAdapter movieListAdapter = new MovieListAdapter(this);

            mGenderListRecyclerView.setLayoutManager(linearLayoutManager);
            mGenderListRecyclerView.setAdapter(movieListAdapter);

            ArrayList<String> genderList = new ArrayList<>();

            genderList.add("War");
            genderList.add("Western");
            genderList.add("Action");
            genderList.add("Adventure");
            genderList.add("Animation");
            genderList.add("Comedy");
            genderList.add("Crime");
            genderList.add("Documentary");
            genderList.add("Drama");
            genderList.add("Family");
            genderList.add("Fantasy");
            genderList.add("History");
            genderList.add("Horror");
            genderList.add("Music");
            genderList.add("Mystery");
            genderList.add("Romance");
            genderList.add("Science Fiction");
            genderList.add("TV Movie");
            genderList.add("Thriller");

            movieListAdapter.swapMoviesList(genderList);
        }
    }
