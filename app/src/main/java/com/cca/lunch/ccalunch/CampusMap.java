package com.cca.lunch.ccalunch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CampusMap extends AppCompatActivity {

    RadioButton bA, bB, bC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);

        bA = (RadioButton) findViewById(R.id.radioButtonA);
        bB = (RadioButton) findViewById(R.id.radioButtonB);
        bC = (RadioButton) findViewById(R.id.radioButtonC);

    }

    public void placeSelected(View v){
       RadioButton buttonPressed = (RadioButton) v;
        if(buttonPressed == bA){
            bB.setEnabled(false);
            bC.setEnabled(false);
        }else if(buttonPressed == bB){
            bA.setEnabled(false);
            bC.setEnabled(false);
        }else if(buttonPressed == bC){
            bA.setEnabled(false);
            bB.setEnabled(false);
        }
    }
}
