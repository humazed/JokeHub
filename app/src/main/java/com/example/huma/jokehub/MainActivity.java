package com.example.huma.jokehub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.huma.jokedisplay.DisplayActivity;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

    }

    public void tellJoke(View view) throws ExecutionException, InterruptedException {
        mProgressBar.setVisibility(View.VISIBLE);
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String joke = task.execute().get();

        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DisplayActivity.class).putExtra("joke", joke));
    }

}