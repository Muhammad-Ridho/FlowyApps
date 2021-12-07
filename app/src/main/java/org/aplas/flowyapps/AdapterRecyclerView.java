package org.aplas.flowyapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<ItemModel> dataItem;



    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaBunga, txtNamaLatin;
        ImageView bungaImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNamaBunga = itemView.findViewById(R.id.txt_judul);
            txtNamaLatin = itemView.findViewById(R.id.txt_namaLainBunga);
            bungaImg = itemView.findViewById(R.id.img_item);
        }
    }

    AdapterRecyclerView(ArrayList<ItemModel> data){
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        TextView txt_judul = holder.txtNamaBunga;
        TextView txt_latin = holder.txtNamaLatin;
        ImageView imgBunga = holder.bungaImg;

        txt_judul.setText(dataItem.get(position).getNamaBunga());
        txt_latin.setText(dataItem.get(position).getNamaLatin());
        imgBunga.setImageResource(dataItem.get(position).getImgBunga());



    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
