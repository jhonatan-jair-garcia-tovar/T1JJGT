package com.mx.edu.isc.t1jjgt;

import androidx.annotation.StringDef;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class frm2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText cD1;
    EditText cD2;
    TextView lTitulo;
    TextView lResultado;
    Button btnCalcular;
    double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        lTitulo=findViewById(R.id.textView2);
        cD1=findViewById(R.id.editText);
        cD2=findViewById(R.id.editText2);
        lResultado=findViewById(R.id.textView4);
        Bundle ope=getIntent().getExtras();
        btnCalcular= findViewById(R.id.button5);
        btnCalcular.setOnClickListener(this);
        switch (ope.getInt("operacion")) {
            case 1:
                lTitulo.setText("SUMA");
                break;
            case 2:
                lTitulo.setText("RESTA");
                break;
            case 3:
                lTitulo.setText("MULTIPLICACION");
                break;
            case 4:
                lTitulo.setText("DIVICION");
                break;
        }

    }

    @Override
    public void onClick(View view) {
        Bundle ope=getIntent().getExtras();
        switch (ope.getInt("operacion")) {
            case 1:
                resultado=(Integer.parseInt(cD1.getText().toString()))+(Integer.parseInt(cD2.getText().toString()));
                lResultado.setText(""+resultado);
                break;
            case 2:
                resultado=(Integer.parseInt(cD1.getText().toString()))-(Integer.parseInt(cD2.getText().toString()));
                lResultado.setText(""+resultado);
                break;
            case 3:
                resultado=(Integer.parseInt(cD1.getText().toString()))*(Integer.parseInt(cD2.getText().toString()));
                lResultado.setText(""+resultado);
                break;
            case 4:
                resultado=(Integer.parseInt(cD1.getText().toString()))/(Integer.parseInt(cD2.getText().toString()));
                lResultado.setText(""+resultado);
                break;
        }
    }
}
