package com.example.filelayout;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btns=findViewById(R.id.btns);


         btns.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {

                username.getText().toString();
                password.getText().toString();
                Toast.makeText(MainActivity.this, "SUCCESSFULLY DONE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
