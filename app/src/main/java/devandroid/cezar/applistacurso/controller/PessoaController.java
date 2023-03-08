package devandroid.cezar.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.cezar.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller iniciado ");
        return super.toString();
    }

    public void salvar(Pessoa pessoa){
        Log.d("MVC_Controller", "Salvo: " + pessoa.toString());


    }
}
