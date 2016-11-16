package com.cca.lunch.ccalunch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Debug;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    SharedPreferences savedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        savedData = getApplicationContext().getSharedPreferences("UserSettings", Context.MODE_PRIVATE);
    }

    public void newOrder(View v){
        if(savedData.getBoolean("setupComplete", false)){
            Log.v("CCA", "Setup is complete!");
        }else{
            Log.v("CCA", "Setup is incomplete!");
            Intent i = new Intent(this, EnterPin.class);
            startActivity(i);
            //TODO : Guide the user through setup of PIN, and Cart Delivery Location
        }
    }
}
