package com.example.huma.jokehub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.JokeProvider;
import com.example.huma.jokedisplay.DisplayActivity;

public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.OnResultReturned {

    private String mJoke;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        mJoke = JokeProvider.getJoke();
    }

    public void tellJoke(View view) {
        mProgressBar.setVisibility(View.VISIBLE);
        Toast.makeText(this, mJoke, Toast.LENGTH_SHORT).show();
        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        task.execute(mJoke);
    }

    @Override
    public void onResult(String s) {
        mProgressBar.setVisibility(View.GONE);
        startActivity(new Intent(this, DisplayActivity.class)
                .putExtra("joke", mJoke));
    }
}
