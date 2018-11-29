package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.constants.Constants;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Movie;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * The type Movie detail activity.
 */
public class MovieDetailActivity extends AppCompatActivity {

    /**
     * The Original title.
     */
    @BindView(R.id.originalTitle)
    TextView originalTitle;

    /**
     * The Title.
     */
    @BindView(R.id.title)
    TextView title;

    /**
     * The Release date.
     */
    @BindView(R.id.releaseDate)
    TextView releaseDate;

    /**
     * The Cover.
     */
    @BindView(R.id.cover)
    ImageView cover;

    /**
     * The Rating.
     */
    @BindView(R.id.rating)
    TextView rating;

    /**
     * The Overview.
     */
    @BindView(R.id.overview)
    TextView overview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);
        ButterKnife.bind(this);

        Movie movie = (Movie) getIntent().getExtras().getSerializable(Constants.INTENT_MOVIE_DETAIL);

        if (movie != null) {
            Glide.with(this).load(Constants.MOVIEDB_LARGE_POSTER_URL + movie.getPosterPath()).into(cover);
            title.setText(movie.getTitle());
            originalTitle.setText(movie.getOriginalTitle());
            releaseDate.setText(movie.getReleaseDate());
            rating.setText(String.valueOf(movie.getVoteAverage()));
            overview.setText(movie.getOverview());
        }

    }
}
