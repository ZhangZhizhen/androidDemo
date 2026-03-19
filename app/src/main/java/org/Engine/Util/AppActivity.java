package org.Engine.Util;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.global.idlerogue.R;


public class AppActivity extends AppCompatActivity {
    private static final String TAG = "AppActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
    }
}