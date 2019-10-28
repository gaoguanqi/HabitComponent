package com.maple.main.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.maple.main.R;
import com.maple.main.view.activity.SplashActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        startActivity(new Intent(this, SplashActivity.class));
        this.finish();
    }
}
