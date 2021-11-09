package com.jubeh.palfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ListView list;
    private Spinner spinner;
    private ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        ImageView image1=findViewById(R.id.image1);
        Button button1=findViewById(R.id.hh);
        TextView text1=findViewById(R.id.text1);
        TextView text2=findViewById(R.id.textview2);


        list = (ListView) findViewById(R.id.listview);
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Keep Going !");
        arrayList.add("No Pain No Gain");
        arrayList.add("No Savage Not Average");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);

        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);




    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (i == 1) {
            switch1();
        }
        if (i == 2) {
            switch2();
        }
        if (i == 3) {
            switch3();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void switch1(){
        Intent switchActivityIntent=new Intent(this, ArmDay.class);
        startActivity(switchActivityIntent);


    }

    public void switch2(){
        Intent switchActivityIntent=new Intent(this, LegsDay.class);
        startActivity(switchActivityIntent);


    }

    public void switch3(){
        Intent switchActivityIntent=new Intent(this, Chest_Back_Day.class);
        startActivity(switchActivityIntent);
    }

    public void switch4(){
        Intent switchActivityIntent=new Intent(this, login.class);
        startActivity(switchActivityIntent);
    }

    public void login(View view) {
        switch4();
    }
}