package org.Engine.Util;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.global.idlerogue.R;


public class AppActivity extends AppCompatActivity {
    private static final String TAG = "AppActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Log.i("AppActivity", "onCreate");
        while (true) {
            Log.i("AppActivity", "onCreate"+5/0);
        }
    }
}