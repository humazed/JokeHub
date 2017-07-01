package com.example.huma.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Step 2: Create an Android Library
 * <p>
 * Create an Android Library containing an Activity that will display a joke passed to it as an intent extra.
 * Wire up project dependencies so that the button can now pass the joke from the Java Library to the Android Library.
 */
public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("joke"));

    }
}
