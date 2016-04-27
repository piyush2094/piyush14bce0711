package com.example.deepak.vshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_song);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.songs.add(((TextView)findViewById(R.id.addData)).getText().toString());
                data.songsURL.add("www.google.co.in/search?client=opera&q="+
                        ((TextView)findViewById(R.id.addData)).getText().toString()
                        +"+&sourceid=opera&ie=UTF-8&oe=UTF-8");
                Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG);
            }
        });
    }
}
