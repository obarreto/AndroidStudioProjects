package com.example.appsoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//AppCompat utiliza retrocompatividade com outras activity e necessariamente irá herda da AppComptActivity
public class MainActivity extends AppCompatActivity {
    TextView textView;

    public EditText txtNum1;
    public EditText txtNum2;
    public TextView ldlResultado;


    @Override
    //O metodo onCreate é o primeiro ser chamado pelo AndroidStudio, e é utilizado como ponto de partida
    protected void onCreate(Bundle savedInstanceState) {

        /*
        1 - super.onCreate avisa ao sistema Android que além do codigo que vamos inserir aqui , queremos
        que o código que está no método onCreate da classe pai seja executado. Caso não insira essa
        chamada a exceção "Super not called exception" será dispara.
        */
        super.onCreate(savedInstanceState);

        /*
        2 - Essa chamada recebe como parâmetro a id do código XML que servirá de interface gráfica
        para esta activity. Em set.ContentView, podemos acessar os elementos que estão que estão no
        arquivo XML precedido por R.layout
        */
        setContentView(R.layout.activity_main);

        /*
        3 - findViewById irá criar uma referência para o elemento da interface gráfica e eu vou
        adicionar essa referência como atributo da classe. Porém deve-se garantir que um ID foi foi
        configurado no código XML na marcação da view, como está abaixo - txtNum1, txtNum2, ldlResultado
        foram configurado em app -> res(resource) -> layout -> activity_main.xml. Como o metodo
        findViewById retorna o objeto da classe View é necessário sempre converter esse objeto para
        o tipo de dado específico conrrespondete. R.id acessa o rsource
        */

        textView = (TextView)findViewById(R.id.textView);

        System.out.println(textView.getText());
        this.txtNum1 = findViewById(R.id.txtNum1);
        this.txtNum2 = findViewById(R.id.txtNum2);
        this.ldlResultado = findViewById(R.id.ldlResultado);
    }
   /* float number1 = 6;
    float number2 = 4;

    //Instaciando o metodo Operacoes
    Operacoes operacoes = new Operacoes(number1, number2);
		System.out.println(operacoes.soma());
		System.out.println(operacoes.subtracao());
		System.out.println(operacoes.multiplicacao());
		System.out.println(operacoes.divisao());*/
        public void somar(View view){

        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        int total = num1 + num2;

        //Metodo converte qualquer coisa para string
        this.ldlResultado.setText(String.valueOf(total));

        }
}
