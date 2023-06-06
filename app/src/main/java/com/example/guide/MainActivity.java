package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        b1.setOnClickListener(listener);
        b2.setOnClickListener(listener);
        b3.setOnClickListener(listener);
    }
    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this , PatternDetails.class);
            String id = String.valueOf(view.getId());
            intent.putExtra("keyIdButton", id);
            startActivity(intent);
        }
    };
}



