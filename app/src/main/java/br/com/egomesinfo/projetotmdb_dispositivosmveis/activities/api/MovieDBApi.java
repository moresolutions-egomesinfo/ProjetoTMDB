package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.api;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDBApi {
    /**
     * Gets popular movies.
     *
     * @param apiKey the api key
     * @return the popular movies
     */
    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    /**
     * Gets top rated movies.
     *
     * @param apiKey the api key
     * @return the top rated movies
     */
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);


}
