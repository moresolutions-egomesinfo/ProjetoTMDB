package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TheMovie {
    private static final String api_key = "1b2754df6de02a8b2f258d2130475831";
    private static final String web_service_url_list_genre = "https://api.themoviedb.org/3/genre/movie/list?api_key=1b2754df6de02a8b2f258d2130475831%26language=%s";
    private static final String web_service_url_list_film_genre = "https://api.themoviedb.org/3/discover/movie?api_key=1b2754df6de02a8b2f258d2130475831%26language=%s%26with_genres=%s";
    private static final String web_service_url_poster_movie = "https://image.tmdb.org/t/p/w500/%s";
}
