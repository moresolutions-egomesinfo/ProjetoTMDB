package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.activitys;

public class Movie {

    public final int idMovie;
    public final String titleMovie;
    public final String originalTitleMovie;
    public final String posterPath;
    public final String overview;
    public final String releaseDate;

    public Movie(int idMovie, String titleMovie, String originalTitleMovie, String posterPath, String overview, String releaseDate) {
        this.idMovie = idMovie;
        this.titleMovie = titleMovie;
        this.originalTitleMovie = originalTitleMovie;
        this.posterPath = posterPath;
        this.overview = overview;
        this.releaseDate = releaseDate;
    }
}
