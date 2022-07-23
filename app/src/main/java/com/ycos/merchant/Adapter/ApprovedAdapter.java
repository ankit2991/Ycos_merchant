package com.ycos.merchant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ycos.merchant.Model.ApprovedModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class ApprovedAdapter extends RecyclerView.Adapter<ApprovedAdapter.approvedViewHolder> {

    public ApprovedAdapter(ArrayList<ApprovedModel> dataHolder) {
        DataHolder = dataHolder;
    }

    ArrayList<ApprovedModel> DataHolder;

    @NonNull
    @Override
    public approvedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.approvedfrag_row_item, parent, false);
        return new approvedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull approvedViewHolder holder, int position) {
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

    class approvedViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        TextView title1;
        TextView title2;
        TextView title3;

        public approvedViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView1 = itemView.findViewById(R.id.approved_img);
            imageView2 = itemView.findViewById(R.id.approvedEdit_img);
            imageView3 = itemView.findViewById(R.id.approvedDelete_img);
            title1 = itemView.findViewById(R.id.approvedCarService_txt);
            title2 = itemView.findViewById(R.id.approvedRupee_txt);
            title3 = itemView.findViewById(R.id.Approved_txt);
        }
    }
}
