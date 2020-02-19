package com.example.appsoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//AppCompat utiliza retrocompatividade com outras activity e necessariamente irá herda da AppComptActivity
public class MainActivity extends AppCompatActivity {

    public EditText txtNum1;
    public EditText txtNum2;
    public TextView ldlResultado;


    @Override
    //Um metodo do ciclo de vida da Activity.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R.id acessa o rsoource
        this.txtNum1 = findViewById(R.id.txtNum1);
        this.txtNum2 = findViewById(R.id.txtNum2);
        this.ldlResultado = findViewById(R.id.ldlResultado);
    }
        public void somar(View view){


        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        int total = num1 + num2;

        //Metodo converte qualquer coisa para string
        this.ldlResultado.setText(String.valueOf(total));

        }
}
