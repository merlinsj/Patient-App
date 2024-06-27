package com.example.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
   EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
   AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
         ed1=(EditText) findViewById(R.id.PName);
         ed2=(EditText) findViewById(R.id.age);
         ed3=(EditText) findViewById(R.id.hname);
         ed4=(EditText) findViewById(R.id.pincd);
         ed5=(EditText) findViewById(R.id.mobno);
         ed6=(EditText) findViewById(R.id.userNm);
         ed7=(EditText) findViewById(R.id.passwd);
         ed8=(EditText) findViewById(R.id.cnpass);
         bt1=(AppCompatButton) findViewById(R.id.regbt);
         bt2=(AppCompatButton) findViewById(R.id.logbt);
         bt2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i=new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(i);
             }
         });
         bt1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String getPatientname = ed1.getText().toString();
                 String getAge = ed2.getText().toString();
                 String getHouseName = ed3.getText().toString();
                 String getPincode = ed4.getText().toString();
                 String getMobileNum = ed5.getText().toString();
                 String getUname = ed6.getText().toString();
                 String getPassword = ed7.getText().toString();
                 String getConfirmpass = ed8.getText().toString();

                 Toast.makeText(getApplicationContext(),getPatientname+" "+getAge+" "+getHouseName+" "+getPincode+" "+getMobileNum+" "+getUname+ " "+getPassword+" " +getConfirmpass,Toast.LENGTH_LONG).show();
             }
         });

    }
}