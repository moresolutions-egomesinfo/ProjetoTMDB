package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GenresResponse {
    /**
     * The Genre results.
     */
    @SerializedName("results")
    List<Genre> genreResults;

    /**
     * Gets genre results.
     *
     * @return the genre results
     */
    public List<Genre> getGenreResults() {
        return genreResults;
    }

}
