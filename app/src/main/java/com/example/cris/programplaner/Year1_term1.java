package com.example.cris.programplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Year1_term1 extends AppCompatActivity {

    private Button add1_1,add1_2,add1_3,comfirmcourse;
    private TextView course1_1, course1_2, course1_3;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1_term1);

        add1_1 = (Button)findViewById(R.id.add1_1);
        add1_2 = (Button)findViewById(R.id.add1_2);
        add1_3 = (Button)findViewById(R.id.add1_3);
        comfirmcourse = (Button)findViewById(R.id.comfirmcourse);

        course1_1 = (TextView)findViewById(R.id.course1_1);
        course1_2 = (TextView)findViewById(R.id.course1_2);
        course1_3 = (TextView)findViewById(R.id.course1_3);

        add1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Search();
            }
        });

        add1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Search();
            }
        });

        add1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Search();
            }
        });

        comfirmcourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadcourse();
            }
        });
    }

    private void uploadcourse() {
        mDatabase = FirebaseDatabase.getInstance().getReference();

    }

    private void Search(){
        Intent intent = new Intent(Year1_term1.this,Search.class);
        startActivity(intent);

    }
}
