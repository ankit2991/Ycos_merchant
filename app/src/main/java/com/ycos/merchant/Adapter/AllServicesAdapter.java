package com.ycos.merchant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ycos.merchant.Model.AllServicesModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class AllServicesAdapter extends RecyclerView.Adapter<AllServicesAdapter.allServiceViewHolder> {
    ArrayList<AllServicesModel> DataHolder;

    public AllServicesAdapter(ArrayList<AllServicesModel> dataHolder) {
        DataHolder = dataHolder;
    }

    @NonNull
    @Override
    public allServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.allservicesfrag_row_item, parent, false);
        return new allServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull allServiceViewHolder holder, int position) {
        holder.imageView1.setImageResource(DataHolder.get(position).getImage1());
        holder.imageView2.setImageResource(DataHolder.get(position).getImage2());
        holder.imageView3.setImageResource(DataHolder.get(position).getImage3());
        holder.title1.setText(DataHolder.get(position).getTitle1());
        holder.title2.setText(DataHolder.get(position).getTitle2());
        holder.title3.setText(DataHolder.get(position).getTitle3());
    }

    @Override
    public int getItemCount() {
        return DataHolder.size();
    }

    class allServiceViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        TextView title1;
        TextView title2;
        TextView title3;

        public allServiceViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.Services_img);
            imageView2 = itemView.findViewById(R.id.edit_img);
            imageView3 = itemView.findViewById(R.id.delete_img);
            title1 = itemView.findViewById(R.id.carService_txt);
            title2 = itemView.findViewById(R.id.rupee_txt);
            title3 = itemView.findViewById(R.id.approved_txt);
        }
    }

}
