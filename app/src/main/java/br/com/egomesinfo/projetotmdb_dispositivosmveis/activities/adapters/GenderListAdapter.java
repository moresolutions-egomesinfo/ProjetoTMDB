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

public class GenderListAdapter extends RecyclerView.Adapter<GenderListAdapter.GenderListViewHolder> {
    Context mContext;
    ArrayList<String> mGenderList;

    public GenderListAdapter(Context context) {
        mContext = context;
        mGenderList = new ArrayList<>();
    }

    @NonNull
    public GenderListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflatedView = inflater.inflate(R.layout.activity_detalhe_filme, parent, false);
        return new GenderListViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(GenderListViewHolder holder, int position){
            holder.mMovieInfoTextView.setText(mGenderList.get(position));
    }

    @Override
    public int getItemCount(){
        return (mGenderList != null) ? mGenderList.size() : 0;
    }

    public void swapGenderList(ArrayList<String> mGenderList) {
            if (mGenderList != null) {
                mGenderList = mGenderList;
                notifyDataSetChanged();
            }
        }

    class GenderListViewHolder extends RecyclerView.ViewHolder {

        TextView mMovieInfoTextView;

        public GenderListViewHolder(View itemView) {
            super(itemView);
            mMovieInfoTextView = itemView.findViewById(R.id.text_movie_info);
        }
    }
}
