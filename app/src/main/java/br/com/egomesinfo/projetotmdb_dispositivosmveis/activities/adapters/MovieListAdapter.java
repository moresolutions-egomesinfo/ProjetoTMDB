package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ListMovieViewHolder> {
    Context mContext;
    ArrayList<String> mMoviesList;

    public MovieListAdapter(Context context) {
        mContext = context;
        mMoviesList = new ArrayList<>();
    }

    @Override
    public ListMovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflatedView = inflater.inflate(R.layout.movie_detail, parent, false);
        return new ListMovieViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ListMovieViewHolder holder, int position) {
        holder.mMovieInfoTextView.setText(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return (mMoviesList != null) ? mMoviesList.size() : 0;
    }

    public void swapMoviesList(ArrayList<String> moviesList) {
        if (mMoviesList != null) {
            mMoviesList = moviesList;
            notifyDataSetChanged();
        }
    }

    class ListMovieViewHolder extends RecyclerView.ViewHolder {

        TextView mMovieInfoTextView;

        public ListMovieViewHolder(View itemView) {
            super(itemView);
            mMovieInfoTextView = itemView.findViewById(R.id.textViewOverViewMovie);
        }
    }
}
