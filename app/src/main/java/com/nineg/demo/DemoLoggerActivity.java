package com.nineg.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nineg.logger.Logger;

public class DemoLoggerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger);
        Logger.d("123", "LoggerHello %s", System.currentTimeMillis());
    }
}
