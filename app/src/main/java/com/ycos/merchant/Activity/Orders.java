package com.ycos.merchant.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ycos.merchant.Adapter.OrdersAdapter;
import com.ycos.merchant.Model.OrdersModel;
import com.ycos.merchant.R;
import com.ycos.merchant.Utility.Utils;

import java.util.ArrayList;

public class Orders extends AppCompatActivity {
    private RecyclerView orderRecyclerview;
    ArrayList<OrdersModel> dataHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        Utils.blackIconStatusBar(Orders.this, R.color.light_Background);

        orderRecyclerview = findViewById(R.id.order_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        orderRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for order recyclerview
        dataHolder = new ArrayList<>();

        OrdersModel orMod1 = new OrdersModel("Service No: #1234", "17/07/2022", "Status: PENDING", "Mr.Dashrath Singh", "+91-7357775815");
        dataHolder.add(orMod1);
        OrdersModel orMod2 = new OrdersModel("Service No: #1235", "17/07/2022", "Status: PENDING", "Vishnu", "+91-7257775815");
        dataHolder.add(orMod2);

        orderRecyclerview.setAdapter(new OrdersAdapter(dataHolder));

        // press BackActivity onClick
        ImageView imageView = findViewById(R.id.back_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, Home.class);
                startActivity(intent);
            }
        });
    }
}