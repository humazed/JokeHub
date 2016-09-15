package com.example.huma.jokehub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.Toast;

import com.example.JokeProvider;
import com.example.huma.jokedisplay.DisplayActivity;

public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.OnResultReturned {

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJoke = JokeProvider.getJoke();
    }

    public void tellJoke(View view) {
        Toast.makeText(this, mJoke, Toast.LENGTH_SHORT).show();

        EndpointsAsyncTask task = new EndpointsAsyncTask(this);
        task.execute(new Pair<Context, String>(this, mJoke));

    }

    @Override
    public void onResult(String s) {
        startActivity(new Intent(this, DisplayActivity.class)
                .putExtra("joke", mJoke));
    }
}
