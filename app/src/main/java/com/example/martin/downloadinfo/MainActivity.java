package com.example.martin.downloadinfo;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final String REDDIT_URL= "http://www.reddit.com/r/all.json?limit=5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask mytask= new MyAsyncTask();
        mytask.execute();
    }

    private class MyAsyncTask extends AsyncTask<String, Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            String myFirstParam= params[0];
            HttpClient httpClient= new DefaultHttpClient();

            return myFirstParam;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
        }
    }
}
