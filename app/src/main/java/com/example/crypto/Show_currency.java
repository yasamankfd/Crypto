package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class Show_currency extends AppCompatActivity {

    String symbol;
    String url , url1 = "https://min-api.cryptocompare.com/data/price?fsym=",url2 = "&tsyms=USD,JPY,EUR&api_key=16a02fcabd02fd979e8a0c01a752d6704539e45a4e5aed27ed4a2dc6e3e972ad";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_currency);

        Bundle b = getIntent().getExtras();
        symbol = b.getString("symbol");
        url = url1+symbol+url2;

        getData getdata = new getData(url);
        getdata.execute();

        try{

            String res = getdata.get().toString();
            System.out.println("this is response : ----------------------------------------------------> "+res);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
    class getData extends AsyncTask {
        String url ;
        public getData(String url){
            this.url = url;
        }

        @Override
        protected Object doInBackground(Object[] objects) {

            String res="none";
            try {

                URL u = new URL(url);

                HttpURLConnection conn = (HttpURLConnection) u.openConnection();
                conn.setDoOutput(true);
                conn.setDoInput(true);

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

                StringBuilder sb = new StringBuilder();
                String line ;

                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
                res = sb.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }
    }

}