package com.mx.edu.isc.t1jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText opcionC;
Button btnSuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSuma=findViewById(R.id.button);
        btnSuma.setOnClickListener(this);
        opcionC= findViewById(R.id.editText4);
       // cD1=(EditText)findViewById(R.id.)
    }

    @Override
    public void onClick(View view) {
        Intent btn1=new Intent(this, frm2Activity.class);
        btn1.putExtra("operacion", Integer.parseInt(opcionC.getText().toString()));
        startActivity(btn1);
    }

}
