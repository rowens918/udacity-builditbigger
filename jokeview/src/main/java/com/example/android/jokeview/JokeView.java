package com.example.android.jokeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeView extends AppCompatActivity {
    public static final String EXTRA_KEY_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke);
        TextView textView = findViewById(R.id.tv_new_joke_text);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey(EXTRA_KEY_JOKE)) {
            textView.setText(bundle.getString(EXTRA_KEY_JOKE));
        }
    }
}
