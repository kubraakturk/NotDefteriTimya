package com.example.user.notdefteritimya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etName;
    EditText etPasswd;
    Button btnGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText) findViewById(R.id.etName);
        etPasswd=(EditText) findViewById(R.id.etPassword);
        btnGiris=(Button) findViewById(R.id.btnGiris);

      btnGiris.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==btnGiris){
            String userName=etName.getText().toString();
            String userPaswd=etPasswd.getText().toString();
            if(userName.equals("Kübra") && userPaswd.equals("123")){
                Intent intent =new Intent(MainActivity.this,GirisActivity.class);
                intent.putExtra("NAME",userName);
                startActivity(intent);
            }
            else{
                Toast.makeText((getApplicationContext()),"Yanlış Bilgi Girdiniz!",Toast.LENGTH_SHORT);

            }
        }
    }
}


