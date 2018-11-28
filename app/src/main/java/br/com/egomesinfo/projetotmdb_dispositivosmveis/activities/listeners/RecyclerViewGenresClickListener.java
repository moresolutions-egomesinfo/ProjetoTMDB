package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.listeners;

import android.view.View;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Genre;

public interface RecyclerViewGenresClickListener {

    /**
     * Recycler view list clicked.
     *
     * @param g            the view
     * @param currentGenre  the current movie
     */
    void recyclerViewGenresListClicked(View g, Genre currentGenre);
}
