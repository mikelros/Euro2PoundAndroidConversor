package com.conversor.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoEuros;
    private TextView textoLibras;
    private Button button;
    private final float CONVERSION = 1.21f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoLibras = (TextView) findViewById(R.id.textViewLibras);
        textoEuros = (EditText) findViewById(R.id.editTextEuros);

        Log.d("CONVERSOR","APP RUNNING");
    }

    public void convertirDivisa(View view) {
        float divisa = Float.parseFloat(textoEuros.getText().toString());
        float divisaConvertida = divisa * CONVERSION;
        textoLibras.setText(String.valueOf(divisaConvertida) + "£");


    }
}
