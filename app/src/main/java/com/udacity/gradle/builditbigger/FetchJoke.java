package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;


import com.example.android.jokeview.JokeView;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public class FetchJoke extends AsyncTask<Pair<Context, String>, Void, String> {
    private static final String LOCAL_IP = "http://10.0.2.2:8080/_ah/api/";
    private static MyApi myApiService = null;
    public String joke = "";
    private Context context;

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if (myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl(LOCAL_IP);
            myApiService = builder.build();
        }

        context = params[0].first;

        try {
            joke = myApiService.sendJoke().execute().getData();
            return joke;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context, JokeView.class);
        intent.putExtra(JokeView.EXTRA_KEY_JOKE, result);
        context.startActivity(intent);
    }

}
