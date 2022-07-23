package com.ycos.merchant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ycos.merchant.Model.UnapprovedModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class UnapprovedAdapter extends RecyclerView.Adapter<UnapprovedAdapter.unapprovedViewHolder> {
    ArrayList<UnapprovedModel> DataHolder;

    public UnapprovedAdapter(ArrayList<UnapprovedModel> dataHolder) {
        DataHolder = dataHolder;
    }

    @NonNull
    @Override
    public unapprovedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.unapprovedfrag_row_item, parent, false);
        return new unapprovedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull unapprovedViewHolder holder, int position) {
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

    class unapprovedViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        TextView title1;
        TextView title2;
        TextView title3;

        public unapprovedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.Unapproved_img);
            imageView2 = itemView.findViewById(R.id.unapprovedEdit_img);
            imageView3 = itemView.findViewById(R.id.unapprovedDelete_img);
            title1 = itemView.findViewById(R.id.UnapprovedName_txt);
            title2 = itemView.findViewById(R.id.UnapprovedRupee_txt);
            title3 = itemView.findViewById(R.id.unapproved_txt);
        }
    }
}
