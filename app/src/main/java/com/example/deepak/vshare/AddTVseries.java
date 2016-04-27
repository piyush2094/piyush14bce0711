package com.example.deepak.vshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddTVseries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tvseries);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.tvseries.add(((TextView)findViewById(R.id.addData)).getText().toString());
                data.tvseriesURL.add("www.google.co.in/search?client=opera&q="+
                        ((TextView)findViewById(R.id.addData)).getText().toString()
                        +"+&sourceid=opera&ie=UTF-8&oe=UTF-8");
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG);
            }
        });

    }

    public void addnewTV (View view){
//        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
//        SharedPreferences.Editor eedit = preferences.edit();
//        String Gamename = tvname.getText().toString();
//        String Egame = preferences.getString("TVName",null);
//        StringBuilder sb = new StringBuilder();
//        sb.append(Gamename).append(",").append(Egame).append(",");
//        eedit.putString("TVName", sb.toString());
//        eedit.apply();

    }

}
