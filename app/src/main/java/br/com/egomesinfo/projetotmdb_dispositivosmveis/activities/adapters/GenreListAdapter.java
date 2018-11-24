package br.com.egomesinfo.projetotmdb_dispositivosmveis.activities.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.egomesinfo.projetotmdb_dispositivosmveis.R;

public class GenreListAdapter extends RecyclerView.Adapter<GenreListAdapter.GenreListViewHolder> {
    Context mContext;
    ArrayList<String> mGenreList;

    public GenreListAdapter(Context context) {
        mContext = context;
        mGenreList = new ArrayList<>();
    }

    @NonNull
    public GenreListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflatedView = inflater.inflate(R.layout.activity_detalhe_filme, parent, false);
        return new GenreListViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(GenreListViewHolder holder, int position){
            holder.mMovieInfoTextView.setText(mGenreList.get(position));
    }

    @Override
    public int getItemCount(){
        return (mGenreList != null) ? mGenreList.size() : 0;
    }

    public void swapGenderList(ArrayList<String> mGenderList) {
            if (mGenderList != null) {
                mGenderList = mGenderList;
                notifyDataSetChanged();
            }
        }

    class GenreListViewHolder extends RecyclerView.ViewHolder {

        TextView mMovieInfoTextView;

        public GenreListViewHolder(View itemView) {
            super(itemView);
            mMovieInfoTextView = itemView.findViewById(R.id.text_movie_info);
        }
    }
}



