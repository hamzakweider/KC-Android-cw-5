package com.example.liverfuul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Alomer = findViewById(R.id.alomer);
        TextView Alassim = findViewById(R.id.alassim);


        Bundle bundle = getIntent().getExtras();
        String ahmed = bundle.getString("item1");
        int omer2 = bundle.getInt("Item2");

        Alomer.setText(omer2+"");
        Alassim.setText(ahmed);

    }
}