package com.example.deepak.vshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.movies.add(((TextView)findViewById(R.id.addData)).getText().toString());
                data.moviesURL.add("www.google.co.in/search?client=opera&q="+
                        ((TextView)findViewById(R.id.addData)).getText().toString()
                        +"+&sourceid=opera&ie=UTF-8&oe=UTF-8");
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG);
            }
        });
    }

    public void addnewGame (View view){
//        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
//        SharedPreferences.Editor eedit = preferences.edit();
//        int k = preferences.getInt("Gno",0);
//        String Gamename = mname.getText().toString();
//        String Egame = preferences.getString("MovieName",null);
//        StringBuilder sb = new StringBuilder();
//        sb.append(Gamename).append(",").append(Egame).append(",");
//        eedit.putString("MovieName", sb.toString());
//        eedit.apply();


    }

}
