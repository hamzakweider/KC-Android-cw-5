package com.example.liverfuul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView notice = findViewById(R.id.textView);

        EditText et1= findViewById(R.id.et1);
        EditText et2= findViewById(R.id.et2);


        Button button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                String notice3 = "Fill in the age detail" ;
                String notice2 = "Kindly, fill the details";


                if (et1.getText().toString().equals("")) {

                    notice.setText(notice2);


                }else
                    if (et2.getText().toString().equals("")){

                        notice.setText(notice3);

                }else{
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                        String assad2 = et1.getText().toString();
                        int omer = Integer.parseInt(et2.getText().toString());
                        String assad3 = et2.getText().toString();

                        intent.putExtra("item1", assad2);
                        intent.putExtra("Item2", omer);
                        startActivity(intent);
                    }



                }


            });






            }
        }



