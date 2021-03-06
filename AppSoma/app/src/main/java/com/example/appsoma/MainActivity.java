package com.example.appsoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//AppCompat utiliza retrocompatividade com outras activity e necessariamente irá herda da AppComptActivity
public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText txtA;
    EditText txtB;
    EditText txtC;

    @Override
    //O metodo onCreate é o primeiro ser chamado pelo AndroidStudio, e é utilizado como ponto de partida
    protected void onCreate(Bundle savedInstanceState) {

        /*
        * 1 - super.onCreate avisa ao sistema Android que além do codigo que vamos inserir aqui , queremos
        * que o código que está no método onCreate da classe pai seja executado. Caso não insira essa
        * chamada a exceção "Super not called exception" será disparada.
        */
        super.onCreate(savedInstanceState);

        /*
        * 2 - Essa chamada recebe como parâmetro a id do código XML que servirá de interface gráfica
        * para esta activity. Em set.ContentView, podemos acessar os elementos que estão que estão no
        * arquivo XML precedido por R.layout
        */
        setContentView(R.layout.activity_main);

        /*
        * 3 - findViewById irá criar uma referência para o elemento da interface gráfica e eu vou
        * adicionar essa referência como atributo da classe. Porém deve-se garantir que um ID foi
        * foi configurado no código XML na marcação da view, como está abaixo - txtA, txtB,
        * onSoma foram configurado em app -> res(resource) -> layout -> activity_main.xml.
        * Como o metodo findViewById retorna o objeto da classe View é necessário sempre converter
        * esse objeto para o tipo de dado específico conrrespondete. R.id acessa o rsource
        */

        textView = findViewById(R.id.textView);
        System.out.println(textView.getText());
        /*
        * Para acessar um texto inserido pelo usuário em uma caixa de texto, precisamos invocar
        * primeiramente o método findViewById para obter uma referência ao elemento EditText correspondente e de posse dessa referência invocar getText.
        */
        this.txtA = (EditText)findViewById(R.id.txtA);
        this.txtB = (EditText)findViewById(R.id.txtB);
        this.txtC = (EditText)findViewById(R.id.txtC);

    }
    public void onSoma(View view){
        /*
        *Os métodos setText e getText podem ser chamados tanto em objetos da classe TextView
        *quanto em objetos da classe EditText.
        */

        int pesoCapsula = Integer.parseInt(txtA.getText().toString());
        int capsulaSlHumid = Integer.parseInt(txtB.getText().toString());
        int capsulaSlSeco = Integer.parseInt(txtC.getText().toString());

        Operacoes operacoes = new Operacoes(pesoCapsula,capsulaSlHumid,capsulaSlSeco);
        textView.setText(String.valueOf(operacoes.somar()));

        Toast toast = Toast.makeText(this, "H média ou Speedy", Toast.LENGTH_SHORT );
        toast.show();
    }

   /* public void onSubtrair(View view){

        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = Integer.parseInt(txtC.getText().toString());

        Operacoes operacoes = new Operacoes(a,b,c);
        textView.setText(String.valueOf(operacoes.subtrair()));

        Toast toast = Toast.makeText(this, "Subtract", Toast.LENGTH_SHORT );
        toast.show();
    }

    public void onMultiplicar(View view){

        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = Integer.parseInt(txtC.getText().toString());

        Operacoes operacoes = new Operacoes(a,b,c);
        textView.setText(String.valueOf(operacoes.multiplicar()));

        Toast toast = Toast.makeText(this, "Multiplication", Toast.LENGTH_SHORT );
        toast.show();
    }

    public void onDividir(View view){

        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = Integer.parseInt(txtC.getText().toString());

        Operacoes operacoes = new Operacoes(a,b,c);
        textView.setText(String.valueOf(operacoes.dividir()));

        Toast toast = Toast.makeText(this, "Division", Toast.LENGTH_SHORT );
        toast.show();
    }*/
}
