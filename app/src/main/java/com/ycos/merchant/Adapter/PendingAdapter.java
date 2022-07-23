package com.ycos.merchant.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ycos.merchant.Activity.UserDetails;
import com.ycos.merchant.Model.PendingModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class PendingAdapter extends RecyclerView.Adapter<PendingAdapter.pendingViewHolder> {

    Context context;
    ArrayList<PendingModel> DataHolder;

    public PendingAdapter(Context context, ArrayList<PendingModel> dataHolder) {
        this.context = context;
        DataHolder = dataHolder;
    }

    @NonNull
    @Override
    public pendingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pendingfrag_row_item, parent, false);
        return new pendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pendingViewHolder holder, int position) {
        holder.imageView1.setImageResource(DataHolder.get(position).getImage1());
        holder.imageView2.setImageResource(DataHolder.get(position).getImage2());
        holder.imageView3.setImageResource(DataHolder.get(position).getImage3());
        holder.title1.setText(DataHolder.get(position).getTitle1());
        holder.title2.setText(DataHolder.get(position).getTitle2());
        holder.title3.setText(DataHolder.get(position).getTitle3());
        holder.title4.setText(DataHolder.get(position).getTitle4());
        holder.title5.setText(DataHolder.get(position).getTitle5());
        holder.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UserDetails.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataHolder.size();
    }

    class pendingViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView1;
        ImageView imageView2;
        ImageView imageView3;
        TextView title1;
        TextView title2;
        TextView title3;
        TextView title4;
        TextView title5;

        public pendingViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.PeDetails_img);
            imageView2 = itemView.findViewById(R.id.PeCheck_img);
            imageView3 = itemView.findViewById(R.id.PeUnchecked_img);
            title1 = itemView.findViewById(R.id.PeUser_name);
            title2 = itemView.findViewById(R.id.PeUser_number);
            title3 = itemView.findViewById(R.id.PendingDate);
            title4 = itemView.findViewById(R.id.PendingTime);
            title5 = itemView.findViewById(R.id.PendingPayMode);
        }
    }
}
