package com.example.dahnbalan.assignment2;

import android.support.test.espresso.Espresso;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Espresso test, which will execute on an Android device.
 * @author dahnbalan
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoUITest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void veryStrongPassword () {
        onView(withId(R.id.editText)).perform(typeText("Equ@lKite59"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Very Strong")));
    }

    @Test
    public void strongPassword () {
        onView(withId(R.id.editText)).perform(typeText("AppleTree24"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Strong")));
    }

    @Test
    public void goodPassword () {
        onView(withId(R.id.editText)).perform(typeText("JaMeSWaShInGtOn"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Good")));
    }

    @Test
    public void weakPassword () {
        onView(withId(R.id.editText)).perform(typeText("la1"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }

    @Test
    public void veryWeakPassword () {
        onView(withId(R.id.editText)).perform(typeText("password"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Very Weak")));
    }
}
