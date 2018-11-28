package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.activitys;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.constants.Constants;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.model.Genre;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * The type Genre detail activity.
 */
public class GenreListActivity extends AppCompatActivity {

    /**
     * The Original Name.
     */
    @BindView(R.id.recycler_view_generoFilmes)
    TextView nameGenre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);
        ButterKnife.bind(this);

        Genre genre = (Genre) getIntent().getExtras().getSerializable(Constants.INTENT_GENRE_LIST);

        if (genre != null) {
            Glide.with(this).load( genre.getNameGenre());
            nameGenre.setText(genre.getNameGenre());

        }

    }
}
