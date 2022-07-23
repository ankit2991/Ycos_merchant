package com.ycos.merchant.Activity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ycos.merchant.Adapter.FragAdapter;
import com.ycos.merchant.Fragments.All;
import com.ycos.merchant.Fragments.CompleteFragment;
import com.ycos.merchant.Fragments.PendingFragment;
import com.ycos.merchant.Fragments.RejectFragment;
import com.ycos.merchant.R;
import com.ycos.merchant.Utility.Utils;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Home extends AppCompatActivity {

    /*------------ Variables ------*/

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView imageView;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    TextView SideProfile, SideOrders, SideServices, sideMenu_logout;
    AppCompatButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Utils.blackIconStatusBar(Home.this, R.color.light_Background);

        SideProfile = findViewById(R.id.SideProfile);
        SideOrders = findViewById(R.id.SideOrders);
        SideServices = findViewById(R.id.SideServices);
        sideMenu_logout = findViewById(R.id.sideMenu_logout);


        SideProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
        SideOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Orders.class);
                startActivity(intent);
            }
        });
        SideServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Services.class);
                startActivity(intent);
            }
        });

        sideMenu_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Login.class);
                startActivity(intent);
            }
        });


        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.viewpager);

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragAdapter.addFragment(new All(), "All");
        fragAdapter.addFragment(new PendingFragment(), "Pending");
        fragAdapter.addFragment(new RejectFragment(), "Reject");
        fragAdapter.addFragment(new CompleteFragment(), "Complete");
        viewPager.setAdapter(fragAdapter);

        tabLayout.setupWithViewPager(viewPager);


        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.navigation_view);
        imageView = findViewById(R.id.menu_bar);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        /*------- Navigation Drawer Menu -------*/
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setCheckedItem(R.id.DrawerLayout);

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Are you sure you want to exit the app?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Home.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}