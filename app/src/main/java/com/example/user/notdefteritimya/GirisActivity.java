package com.example.user.notdefteritimya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GirisActivity extends AppCompatActivity {
    TextView tvName;
    EditText etNote;
    Button btnAddNote;
    ListView lvNote;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        tvName=(TextView) findViewById(R.id.tvUserName);
        String account=getIntent().getStringExtra("NAME");
        tvName.setText(account);
        etNote=(EditText) findViewById(R.id.etNewNote);
        btnAddNote=(Button) findViewById(R.id.btnAddNote);
        lvNote=(ListView) findViewById(R.id.lvNote);
        arrayList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(GirisActivity.this,android.R.layout.simple_list_item_1,arrayList);

        lvNote.setAdapter(adapter);

        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tvNote=etNote.getText().toString();
                arrayList.add(tvNote);
                adapter.notifyDataSetChanged();
                etNote.setText("");
            }
        });

     }
}
