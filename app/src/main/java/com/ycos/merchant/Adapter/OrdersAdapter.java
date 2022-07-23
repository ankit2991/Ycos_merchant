package com.ycos.merchant.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ycos.merchant.Model.OrdersModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.orderViewHolder> {
    ArrayList<OrdersModel> DataHolder;

    public OrdersAdapter(ArrayList<OrdersModel> dataHolder) {
        DataHolder = dataHolder;
    }

    @NonNull
    @Override
    public orderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_row_item, parent, false);
        return new orderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewHolder holder, int position) {
        holder.title1.setText(DataHolder.get(position).getTitle1());
        holder.title2.setText(DataHolder.get(position).getTitle2());
        holder.title3.setText(DataHolder.get(position).getTitle3());
        holder.title4.setText(DataHolder.get(position).getTitle4());
        holder.title5.setText(DataHolder.get(position).getTitle5());
    }

    @Override
    public int getItemCount() {
        return DataHolder.size();
    }

    class orderViewHolder extends RecyclerView.ViewHolder {
        TextView title1;
        TextView title2;
        TextView title3;
        TextView title4;
        TextView title5;

        public orderViewHolder(@NonNull View itemView) {
            super(itemView);
            title1 = itemView.findViewById(R.id.orderService);
            title2 = itemView.findViewById(R.id.orderDate);
            title3 = itemView.findViewById(R.id.orderStatus);
            title4 = itemView.findViewById(R.id.orderUser_name);
            title5 = itemView.findViewById(R.id.orderUser_number);
        }
    }
}
