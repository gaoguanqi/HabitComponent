package com.maple.account.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.maple.account.R;
import com.maple.account.view.LoginActivity;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        startActivity(new Intent(this, LoginActivity.class));
        this.finish();
    }
}
