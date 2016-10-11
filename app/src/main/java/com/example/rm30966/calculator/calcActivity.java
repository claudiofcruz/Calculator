package com.example.rm30966.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class calcActivity extends AppCompatActivity {
    private EditText edtNumero1, edtNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        edtNumero1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumero2 = (EditText) findViewById(R.id.edtNumber2);
    }

    public void calcular(View v)
    {

        try
        {
            int num1 = Integer.parseInt(edtNumero1.getText().toString());
            int num2 = Integer.parseInt(edtNumero2.getText().toString());

            int calc = num1 + num2;
            String resultado = getString(R.string.resultMessage) + calc;

            Toast.makeText(this,resultado,Toast.LENGTH_LONG).show();

        }catch(Exception ex)
        {
            Toast.makeText(this,R.string.messageError,Toast.LENGTH_LONG).show();
        }

    }
}
