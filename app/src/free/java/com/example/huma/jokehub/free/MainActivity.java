package com.example.huma.jokehub.free;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.JokeProvider;
import com.example.huma.jokedisplay.DisplayActivity;
import com.example.huma.jokehub.EndpointsAsyncTask;
import com.example.huma.jokehub.R;

public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.OnResultReturned {

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJoke = JokeProvider.getJoke();
    }

    public void tellJoke(View view) {
        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        task.execute(mJoke);
    }

    @Override
    public void onResult(String s) {
        startActivity(new Intent(this, DisplayActivity.class)
                .putExtra("joke", mJoke));
    }
}