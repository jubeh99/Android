package com.jubeh.palfit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;


public class login extends AppCompatActivity {

        EditText email;
        EditText password;
        Button saveLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

         email=findViewById(R.id.password);
         password=findViewById(R.id.email);
         saveLogin=findViewById(R.id.saveLogin);



        };

    public void switchBackHome(){
        Intent switchActivityIntent=new Intent(this, HomeActivity.class);
        startActivity(switchActivityIntent);
    }

    public void saveLogin(View view) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        Editable str1= email.getText();
        Editable str2= password.getText();
        String gsonString1=gson.toJson(str1);
        String gsonString2=gson.toJson(str2);
        editor.putString("email", gsonString1);
        editor.putString("password", gsonString2);
        editor.commit();

        saveLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login.this,"saved",Toast.LENGTH_LONG).show();
            }
        });


    }




}