package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


/*
SerializedName
Uma anotação que indica que esse membro deve ser serializado para JSON
com o valor do nome fornecido como seu nome de campo.
Necessário Incluir no gradle app a implementação:
implementation 'com.google.code.gson:gson:2.6.2'
*/



public class Movie implements Serializable {

    @SerializedName("id")
    private Integer idMovie;
    @SerializedName("genre_ids")
    private Integer idGenreMovie;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("vote_average")
    private Double voteAverage;
    @SerializedName("poster_path")
    private String posterPath;


/**
        * Instantiates a new Movie.
     *
     * @param idMovie      the id
     * @param idGenreMovie   the id genre movie
     * @param overview      the overview
     * @param releaseDate   the release date
     * @param title         the title
     * @param voteAverage   the vote average
     * @param posterPath    the poster path
     * @param originalTitle the original title
     */

    public Movie(Integer idMovie,Integer idGenreMovie,String overview, String releaseDate, String title, Double voteAverage, String posterPath, String originalTitle) {
        this.idMovie = idMovie;
        this.idGenreMovie = idGenreMovie;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.title = title;
        this.voteAverage = voteAverage;
        this.posterPath = posterPath;
        this.originalTitle = originalTitle;
    }

    /**
     * Gets idMovie.
     *
     * @return the idMovie
     */
    public Integer getIdMovie() {
        return idMovie;
    }

    /**
     * Sets idMovie.
     *
     * @param idMovie the idMovie
     */
    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    /**
     * Gets idGenreMovie.
     *
     * @return the idGenreMovie
     */
    public Integer getIdGenreMovie() {
        return idGenreMovie;
    }

    /**
     * Sets idGenreMovie.
     *
     * @param idGenreMovie the idGenreMovie
     */
    public void setIdGenreMovie(Integer idGenreMovie) {
        this.idGenreMovie = idGenreMovie;
    }

    /**
     * Gets overview.
     *
     * @return the overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Sets overview.
     *
     * @param overview the overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets release date.
     *
     * @param releaseDate the release date
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Gets vote average.
     *
     * @return the vote average
     */
    public Double getVoteAverage() {
        return voteAverage;
    }

    /**
     * Sets vote average.
     *
     * @param voteAverage the vote average
     */
    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    /**
     * Gets poster path.
     *
     * @return the poster path
     */
    public String getPosterPath() {
        return posterPath;
    }

    /**
     * Sets poster path.
     *
     * @param posterPath the poster path
     */
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets original title.
     *
     * @return the original title
     */
    public String getOriginalTitle() {
        return originalTitle;
    }

    /**
     * Sets original title.
     *
     * @param originalTitle the original title
     */
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
}


