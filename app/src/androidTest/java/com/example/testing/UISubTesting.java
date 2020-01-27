package com.example.testing;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class UISubTesting {

    @Rule
    public ActivityTestRule<MainActivity>
            testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkNos(){
        onView(withId(R.id.etfirst))
                .perform(typeText("18"));
        onView(withId(R.id.etSecond))
                .perform(typeText("9"));
        onView(withId(R.id.btnSum))
                .perform(click());

        //This is another activity, no need to tell espresso
        onView(withId(R.id.tvOutput))
                .check(matches(withText("9.0")));
    }
}
