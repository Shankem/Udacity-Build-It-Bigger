package com.growingcoder.jokesdisplaylib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT_KEY = "JOKE_INTENT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            TextView jokesView = (TextView) findViewById(R.id.jokes_view);
            jokesView.setText(extras.getString(JOKE_INTENT_KEY));
        }
    }
}
