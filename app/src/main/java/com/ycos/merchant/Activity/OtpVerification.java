package com.ycos.merchant.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ycos.merchant.R;
import com.ycos.merchant.Utility.Utils1;

public class OtpVerification extends AppCompatActivity {
    AppCompatButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        Utils1.blackIconStatusBar(OtpVerification.this, R.color.light_Background1);

        btn = findViewById(R.id.submit_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtpVerification.this, Home.class);
                startActivity(intent);
            }
        });
    }
}