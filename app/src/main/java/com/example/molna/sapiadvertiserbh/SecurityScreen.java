package com.example.molna.sapiadvertiserbh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecurityScreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.security_screen);

        TextView phonenum= findViewById(R.id.phonenumpls);

        String phonenumber = getIntent().getStringExtra("phonenum");

        //teszt az adatabázissal való kommunikálásra

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("cica");

        phonenum.setText(phonenumber);
    }
}
