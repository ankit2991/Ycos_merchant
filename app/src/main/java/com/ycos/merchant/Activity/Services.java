package com.ycos.merchant.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ycos.merchant.Adapter.FragAdapter;
import com.ycos.merchant.Fragments.AllServicesFragment;
import com.ycos.merchant.Fragments.ApprovedFragment;
import com.ycos.merchant.Fragments.UnapprovedFragment;
import com.ycos.merchant.R;
import com.ycos.merchant.Utility.Utils;
import com.google.android.material.tabs.TabLayout;

public class Services extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    TextView pr_header;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);


        Utils.blackIconStatusBar(Services.this, R.color.light_Background);


        tabLayout = findViewById(R.id.ServicesTab_layout);
        viewPager = findViewById(R.id.ServicesViewpager);

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragAdapter.addFragment(new AllServicesFragment(), "All");
        fragAdapter.addFragment(new ApprovedFragment(), "Approved");
        fragAdapter.addFragment(new UnapprovedFragment(), "Unapproved");
        viewPager.setAdapter(fragAdapter);

        tabLayout.setupWithViewPager(viewPager);

        floatingActionButton = findViewById(R.id.floatingBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Services.this, AddService.class);
                startActivity(intent);
            }
        });
        // press BackActivity onClick
        ImageView imageView = findViewById(R.id.back_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Services.this, Home.class);
                startActivity(intent);
            }
        });

        pr_header = findViewById(R.id.pr_header);
        pr_header.setText("Services");
    }
}