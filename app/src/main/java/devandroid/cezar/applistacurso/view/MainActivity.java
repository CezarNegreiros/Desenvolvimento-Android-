package devandroid.cezar.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.cezar.applistacurso.R;
import devandroid.cezar.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa, dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();

        //Atribuir conteúdo, dados, valores para o objeto
        //Conforme o seu modelo
        pessoa.setPrimeiroNome("Cezar");
        pessoa.setSobrenome("Negreiros");
        pessoa.setCursoDesejado("Android");
        pessoa.setNumeroContato("(92) 99123-4567");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Carlos");
        outraPessoa.setSobrenome("Costa");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setNumeroContato("(92) 99345-6789");

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobrenome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Numero de contato: ";
        dadosOutraPessoa += outraPessoa.getNumeroContato();



        int parada = 0;

        //dadosOutraPessoa = outraPessoa.getPrimeiroNome();

    }
}