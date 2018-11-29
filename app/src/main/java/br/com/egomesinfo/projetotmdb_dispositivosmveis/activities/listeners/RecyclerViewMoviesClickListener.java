package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.listeners;

import android.view.View;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Movie;

public interface RecyclerViewMoviesClickListener {

    /**
     * Recycler view list clicked.
     *
     * @param v            the view
     * @param currentMovie  the current movie
     */
    void recyclerViewMoviesListClicked(View v, Movie currentMovie);
}
