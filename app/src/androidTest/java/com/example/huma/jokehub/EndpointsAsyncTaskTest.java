package com.example.huma.jokehub;

import android.test.AndroidTestCase;

/**
 * User: huma
 * Date: 15-Sep-16
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase implements EndpointsAsyncTask.OnResultReturned {

    public void testOnPostExecute() throws Exception {
        new EndpointsAsyncTask(this).execute("Test joke");
    }

    @Override
    public void onResult(String s) {
        assertEquals("Test joke", s);
    }
}