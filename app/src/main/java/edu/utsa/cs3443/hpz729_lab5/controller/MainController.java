package edu.utsa.cs3443.hpz729_lab5.controller;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.hpz729_lab5.ZoneActivity;

public class MainController implements View.OnClickListener{

    private String currentZone;

    public MainController(String currentZone)
    {
        this.currentZone = currentZone;
    }

    public String getCurrentZone() {
        return currentZone;
    }

    public void setCurrentZone(String currentZone) {
        this.currentZone = currentZone;
    }
    /**
     * @param view
     */
    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(view.getContext(), ZoneActivity.class);
        intent.putExtra("ZoneID", currentZone);
        view.getContext().startActivity(intent);
    }
}

//android:layout_width="match_parent"
//android:layout_height="wrap_content"
//android:inputType="text"
//android:text="" />

//EditText myEditText = findViewById(R.id.nameText);
//...
//String input = myEditText.getText().toString();
