package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokeslib.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that sends a joke */
    @ApiMethod(name = "sendJoke")
    public MyBean sendJoke() {
        MyBean response = new MyBean();
        Jokes joke = new Jokes();
        response.setData(joke.getJoke());

        return response;
    }

}
