package com.example.deepak.vshare;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        SharedPreferences shredpref1 = getSharedPreferences("UserData", Context.MODE_PRIVATE);


        if (!shredpref1.contains("Initialized") ) {
            Intent intent = new Intent(this, Signin.class);
            startActivity(intent);
        }else{
            ((TextView) findViewById(R.id.textView)).setText("Games");
            LV = (ListView) findViewById(R.id.ListView);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, data.games);
            LV.setAdapter(adapter);
            LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + data.gamesURL.get(position)));
                    startActivity(i);
                }
            });
        }

        ((Button)findViewById(R.id.add)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AddDATA.class);
                startActivity(i);
            }
        });
        ((Button)findViewById(R.id.movieButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.textView)).setText("Movies");
                LV = (ListView) findViewById(R.id.ListView);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, data.movies);
                LV.setAdapter(adapter);
                LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + data.moviesURL.get(position)));
                        startActivity(i);
                    }
                });
            }
        });
        ((Button)findViewById(R.id.songButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.textView)).setText("Songs");
                LV = (ListView) findViewById(R.id.ListView);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, data.songs);
                LV.setAdapter(adapter);
                LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + data.songsURL.get(position)));
                        startActivity(i);
                    }
                });
            }
        });
        ((Button)findViewById(R.id.tvseriesButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.textView)).setText("TV Series");
                LV = (ListView) findViewById(R.id.ListView);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, data.tvseries);
                LV.setAdapter(adapter);
                LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + data.tvseriesURL.get(position)));
                        startActivity(i);
                    }
                });
            }
        });
        ((Button)findViewById(R.id.gameButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LV = (ListView) findViewById(R.id.ListView);

                ((TextView) findViewById(R.id.textView)).setText("Games");
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, data.games);
                LV.setAdapter(adapter);
                LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + data.gamesURL.get(position)));
                        startActivity(i);
                    }
                });

            }
        });

    }

    public void Games (View view)
    {

        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("GameName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void movies (View view)
    {
        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("MovieName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void TVseries (View view)
    {
        SharedPreferences shrdPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String game = shrdPref.getString("TVName", null);
        String[] Games = game.split(",");
        LV=(ListView)findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Games);
        LV.setAdapter(adapter);

    }
    public void AddData (View view)
    {
        Intent add = new Intent(this,AddDATA.class);
        startActivity(add);
    }

}
