package com.example.deepak.vshare;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        findViewById(R.id.SignB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.signed = true;
                createSharedPref();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
    }

    public void createSharedPref() {
        EditText Uname = (EditText) findViewById(R.id.UName);
        EditText UID = (EditText) findViewById(R.id.UID);
        EditText Ublock = (EditText) findViewById(R.id.UBlock);
        EditText Uroom = (EditText) findViewById(R.id.URoom);
        SharedPreferences sharedPref = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("Initialized", true);
        editor.putString("UserName", Uname.getText().toString());
        editor.putString("UserID", UID.getText().toString());
        editor.putString("UserBlock", Ublock.getText().toString());
        editor.putString("UserRoom", Uroom.getText().toString());
        editor.commit();

        finish();
    }

}
