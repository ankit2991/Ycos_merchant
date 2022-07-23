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
import com.ycos.merchant.Model.RejectModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class RejectAdapter extends RecyclerView.Adapter<RejectAdapter.rejectViewHolder> {
    Context context;

    public RejectAdapter(Context context, ArrayList<RejectModel> dataHolder) {
        this.context = context;
        DataHolder = dataHolder;
    }

    ArrayList<RejectModel> DataHolder;

    @NonNull
    @Override
    public rejectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rejectfrag_row_item, parent, false);
        return new rejectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull rejectViewHolder holder, int position) {
        holder.imageView.setImageResource(DataHolder.get(position).getImage());
        holder.title1.setText(DataHolder.get(position).getTitle1());
        holder.title2.setText(DataHolder.get(position).getTitle2());
        holder.title3.setText(DataHolder.get(position).getTitle3());
        holder.title4.setText(DataHolder.get(position).getTitle4());
        holder.title5.setText(DataHolder.get(position).getTitle5());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
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

    class rejectViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title1;
        TextView title2;
        TextView title3;
        TextView title4;
        TextView title5;

        public rejectViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ReDetails_img);
            title1 = itemView.findViewById(R.id.ReUser_name);
            title2 = itemView.findViewById(R.id.ReUser_number);
            title3 = itemView.findViewById(R.id.RejectDate);
            title4 = itemView.findViewById(R.id.RejectTime);
            title5 = itemView.findViewById(R.id.RejectPayMode);
        }
    }
}
