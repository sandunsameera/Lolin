package com.example.deemonface.lolin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //Initializing widjets
    private Button loginBtn;
    private Button CreateAccntBtn;

   // Button CreateAccntBtn = findViewById(R.id.btn_main_Create_Accnt);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Redirect login btn to login page
        Button loginBtn = (Button)findViewById(R.id.btn_main_logIn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, login_activity.class);
                startActivity(mainIntent);
            }
        });
    }
}
