package com.udacity.gradle.builditbigger;

import android.support.annotation.Nullable;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class checkJokeRetrievalTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Nullable private IdlingResource mIdlingResource;

    @Before
    public void registerIdlingREsource() {
        mIdlingResource = null;
        if (mIdlingResource != null) {
            Espresso.registerIdlingResources(mIdlingResource);
        }
    }

    @Test
    public void clickTellJokeButton() {
        onView((withId(R.id.instructions_text_view))).perform(click());
        onView((withId(R.id.tv_joke_text))).check(matches(withText("")));
    }

    @After
    public void unregisterIdlingREsource() {
        if (mIdlingResource != null) {
            Espresso.unregisterIdlingResources(mIdlingResource);
        }
    }
}
