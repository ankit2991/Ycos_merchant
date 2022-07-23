package com.ycos.merchant.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.ycos.merchant.R;
import com.ycos.merchant.Utility.Utils;

public class Profile extends AppCompatActivity {
    TextView pr_header;

    String[] item1 = {"Rajasthan", "Uttar pradesh", "Mumbai", "Delhi"};
    String[] item2 = {"Jodhpur", "Jaipur", "Udaipur", "Bikaner", "Sikar"};

    AutoCompleteTextView autoCompleteTextView1;
    AutoCompleteTextView autoCompleteTextView2;

    ArrayAdapter<String> adapterItems1;
    ArrayAdapter<String> adapterItems2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Utils.blackIconStatusBar(Profile.this, R.color.light_Background);


        // Drop Down Menu text
        autoCompleteTextView1 = findViewById(R.id.Costumer_state);
        autoCompleteTextView2 = findViewById(R.id.Customer_city);

        adapterItems1 = new ArrayAdapter<String>(this, R.layout.list_item, item1);
        adapterItems2 = new ArrayAdapter<String>(this, R.layout.list_item, item2);

        autoCompleteTextView1.setAdapter(adapterItems1);
        autoCompleteTextView2.setAdapter(adapterItems2);

        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String string = adapterView.getItemAtPosition(position).toString();
            }
        });

        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String string = adapterView.getItemAtPosition(position).toString();
            }
        });

        // press BackActivity onClick
        ImageView imageView = findViewById(R.id.back_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Home.class);
                startActivity(intent);
            }
        });

        pr_header = findViewById(R.id.pr_header);
        pr_header.setText("Profile");
    }
}