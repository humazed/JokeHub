package com.example;

/**
 * Step 1: Create a Java library
 * <p>
 * Your first task is to create a Java library that provides jokes.
 * Create a new Gradle Java project either using the Android Studio wizard, or by hand.
 * Then introduce a project dependency between your app and the new Java Library.
 * If you need review, check out demo 4.01 from the course code.
 * <p>
 * Make the button display a toast showing a joke retrieved from your Java joke telling library.
 */
public class JokeProvider {
    public static String getJoke() {
        return "When I see lovers' names carved in a tree, I don't think it's sweet." +
                " I just think it's surprising how many people bring a knife on a date.";
    }
}
