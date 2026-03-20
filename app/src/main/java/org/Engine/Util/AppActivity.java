package org.Engine.Util;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.zzz.test.R;


public class AppActivity extends AppCompatActivity {
    private static final String TAG = "AppActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Log.i("AppActivity", "onCreate");
        
        // 跳转到 LoginActivity
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        
        // 如果不需要返回到 AppActivity，可以调用 finish()
        finish();
    }
}
