package com.example.molna.sapiadvertiserbh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        findViewById(R.id.BtnLogin).setOnClickListener(new View.OnClickListener() {

            EditText phonenumfield = findViewById(R.id.phonenumFIELD);
            @Override
            public void onClick(View v) {
                String PhoneNum = phonenumfield.getText().toString();

                Intent intent = new Intent(LoginScreen.this,SecurityScreen.class);
                intent.putExtra("phonenum",PhoneNum);
                startActivity(intent);
            }
        });

    }

}
