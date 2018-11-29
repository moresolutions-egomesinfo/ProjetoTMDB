package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse {
    /**
     * The Movie results.
     */
    @SerializedName("results")
    List<Movie> movieResults;

    /**
     * Gets movie results.
     *
     * @return the movie results
     */
    public List<Movie> getMovieResults() {
        return movieResults;
    }

}
