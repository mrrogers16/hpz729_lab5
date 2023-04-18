package edu.utsa.cs3443.hpz729_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import edu.utsa.cs3443.hpz729_lab5.controller.MainController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.buttonTR);
        Button button2 = findViewById(R.id.buttonTY);
        Button button3 = findViewById(R.id.buttonG);
        Button button4 = findViewById(R.id.buttonR);
        Button button5 = findViewById(R.id.buttonD);
        Button button6 = findViewById(R.id.buttonX);
        Button button7 = findViewById(R.id.buttonB);

        button1.setOnClickListener(new MainController(this));
        button2.setOnClickListener(new MainController(this));
        button3.setOnClickListener(new MainController(this));
        button4.setOnClickListener(new MainController(this));
        button5.setOnClickListener(new MainController(this));
        button6.setOnClickListener(new MainController(this));
        button7.setOnClickListener(new MainController(this));


    }
}