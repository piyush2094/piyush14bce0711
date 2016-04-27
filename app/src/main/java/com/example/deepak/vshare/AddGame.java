package com.example.deepak.vshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.games.add(((TextView)findViewById(R.id.addData)).getText().toString());
                data.gamesURL.add("www.google.co.in/search?client=opera&q=" +
                        ((TextView)findViewById(R.id.addData)).getText().toString()
                        + "+&sourceid=opera&ie=UTF-8&oe=UTF-8");
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG);
            }
        });
    }

    public void addnewGame (View view){
//        SharedPreferences preferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
//        SharedPreferences.Editor eedit = preferences.edit();
//        String Gamename = gname.getText().toString();
//        String Egame = preferences.getString("GameName","No Name");
//        StringBuilder sb = new StringBuilder();
//        String pnew = sb.append(Gamename).append(",").append(Egame).append(",").toString();
//        eedit.putString("GameName",pnew );
//        eedit.apply();


    }

}
