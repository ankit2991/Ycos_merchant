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
import com.ycos.merchant.Model.CompleteModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class CompleteAdapter extends RecyclerView.Adapter<CompleteAdapter.completeViewHolder> {
    Context context;
    ArrayList<CompleteModel> DataHolder;

    public CompleteAdapter(Context context, ArrayList<CompleteModel> dataHolder) {
        this.context = context;
        DataHolder = dataHolder;
    }

    @NonNull
    @Override
    public completeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.completefrag_row_item, parent, false);
        return new completeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull completeViewHolder holder, int position) {
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

    class completeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title1;
        TextView title2;
        TextView title3;
        TextView title4;
        TextView title5;

        public completeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ComDetails_img);
            title1 = itemView.findViewById(R.id.ComUser_name);
            title2 = itemView.findViewById(R.id.ComUser_number);
            title3 = itemView.findViewById(R.id.CompleteDate);
            title4 = itemView.findViewById(R.id.CompleteTime);
            title5 = itemView.findViewById(R.id.CompletePayMode);
        }
    }
}
