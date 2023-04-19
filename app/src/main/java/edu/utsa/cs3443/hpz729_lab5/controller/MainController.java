package edu.utsa.cs3443.hpz729_lab5.controller;

import android.content.Intent;
import android.view.View;

public class MainController implements View.OnClickListener{


    public MainController(String zoneID)
    {

    }
    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ZoneActivity.class);


    }
}
