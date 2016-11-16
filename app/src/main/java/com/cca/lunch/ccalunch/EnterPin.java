package com.cca.lunch.ccalunch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class EnterPin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin);
    }

    public void next(View v){
        Intent i = new Intent(this, CampusMap.class);
        startActivity(i);
    }
}
