package com.example.huma.jokehub;

import android.test.AndroidTestCase;

/**
 * User: huma
 * Date: 15-Sep-16
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTask.OnResultReturned {

    public void testOnPostExecute() throws Exception {
        String s = new EndpointsAsyncTask(this).execute().get();
        assertEquals("When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.", s);
    }

    @Override
    public void onResult(String s) {

    }
}